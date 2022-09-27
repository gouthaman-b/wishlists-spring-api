package com.example.wishlist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.wishlist.model.Item;

public interface ItemRepository extends MongoRepository<Item,String> {
    
    List<Item> findByWishlistId(String wishlistId);
}
