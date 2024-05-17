package com.ecommerce.ecommercebackend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    @Column(name = "item_title", nullable = false)
    private String itemTitle;
    @Column(name = "item_subtitle")
    private String itemSubTitle;
    public Item() {

    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemTitle='" + itemTitle + '\'' +
                ", itemSubTitle='" + itemSubTitle + '\'' +
                '}';
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }
}

