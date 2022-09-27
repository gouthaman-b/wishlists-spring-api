package com.example.wishlist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.wishlist.model.Wishlist;

public interface WishlistRepository extends MongoRepository<Wishlist, String> {
    
}
