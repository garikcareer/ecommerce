package com.ecommerce.ecommercebackend.services;

import com.ecommerce.ecommercebackend.models.Item;

import java.util.List;

public interface ItemService {
    // Create
    Item addItem(Item item);

    // Read
    Item getItemById(Long itemId);
    List<Item> getAllItems();

    // Update
    Item updateItem(Item item, Long itemId);

    // Delete
    boolean deleteItemById(Long itemId);
}
