package com.example.wishlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wishlist.model.Item;
import com.example.wishlist.repository.ItemRepository;

@Service
public class ItemService {
    
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> findByWishlistId(String wid){
        return itemRepository.findByWishlistId(wid);
    }

    public void insert(String wid, Item item){
        item.setWishlistId(wid);

        itemRepository.insert(item);
    }

    public Item findById(String id){
        return itemRepository.findById(id).get();
    }

    public void updateById(String wid, String id, Item item){
        Item itemObj = itemRepository.findById(id).get();

        itemObj.setWishlistId(wid);
        itemObj.setName(item.getName());
        itemObj.setUrl(item.getUrl());

        itemRepository.save(itemObj);
    }

    public void deleteById(String id){
        Item itemObj = itemRepository.findById(id).get();
        itemRepository.delete(itemObj);
    }

}
