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

import com.example.wishlist.model.Item;
import com.example.wishlist.service.ItemService;

@RestController
@RequestMapping("api/v1/wishlists/{wid}/items/")
public class ItemController {
    
    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public List<Item> findByWishlistId(@PathVariable String wid){
        return itemService.findByWishlistId(wid);
    }

    @PostMapping("/")
    public void insert(@PathVariable String wid, @RequestBody Item item){
        itemService.insert(wid,item);
    }

    @GetMapping("/{id}")
    public Item findById(@PathVariable String id){
        return itemService.findById(id);
    }

    @PutMapping("/{id}")
    public void updateById(
        @PathVariable String id, 
        @PathVariable String wid, 
        @RequestBody Item item){
        itemService.updateById(wid, id, item);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        itemService.deleteById(id);
    }

}
