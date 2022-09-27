package com.example.wishlist.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
public class Item {
    @Id
    private String id;

    private String name;

    @Indexed(unique = true)
    private String url;

    private String wishlistId;


    public Item(String name, String url, String wishlistId) {
        this.name = name;
        this.url = url;
        this.wishlistId = wishlistId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWishlistId() {
        return this.wishlistId;
    }

    public void setWishlistId(String wishlistId) {
        this.wishlistId = wishlistId;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", url='" + getUrl() + "'" +
            ", wishlistId='" + getWishlistId() + "'" +
            "}";
    }

}
