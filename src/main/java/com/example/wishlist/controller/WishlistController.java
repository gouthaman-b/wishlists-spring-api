package com.example.wishlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wishlist.model.Wishlist;
import com.example.wishlist.service.WishlistService;

@RestController
@RequestMapping("api/v1/wishlists/")
public class WishlistController {
    
    @Autowired
    private WishlistService wishlistService;

    @GetMapping("/")
    public List<Wishlist> findAll(){
        return wishlistService.findAll();
    }

    @PostMapping("/")
    public void insert(@RequestBody Wishlist wishlist){
        wishlistService.insert(wishlist);
    }

    @GetMapping("/{wid}")
    public Wishlist findById(@PathVariable String wid){
        return wishlistService.findById(wid);
    }

    @PutMapping("/{wid}")
    public void updateById(@PathVariable String wid, @RequestBody Wishlist wishlist){
        wishlistService.updateById(wid,wishlist);
    }

    @DeleteMapping("/{wid}")
    public void deleteById(@PathVariable String wid){
        wishlistService.deleteById(wid);
    }
}
