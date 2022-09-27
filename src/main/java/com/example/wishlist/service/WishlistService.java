package com.example.wishlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wishlist.model.Wishlist;
import com.example.wishlist.repository.WishlistRepository;

@Service
public class WishlistService {
    
    @Autowired
    private WishlistRepository wishlistRepository;

    public List<Wishlist> findAll(){
        return wishlistRepository.findAll();
    }

    public void insert(Wishlist wishlist){
        wishlistRepository.insert(wishlist);
    }

    public Wishlist findById(String wid){
        return wishlistRepository.findById(wid).get();
    }

    public void updateById(String wid, Wishlist wishlist){
        Wishlist wishlistObj = wishlistRepository.findById(wid).get();
        wishlistObj.setName(wishlist.getName());
        wishlistRepository.save(wishlistObj);
    }

    public void deleteById(String wid){
        Wishlist wishlistObj = wishlistRepository.findById(wid).get();
        wishlistRepository.delete(wishlistObj);
    }

}
