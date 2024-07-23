package com.ecommerce.ecommercebackend.services;

import com.ecommerce.ecommercebackend.models.Item;
import com.ecommerce.ecommercebackend.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    // Create
    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    // Read
    @Override
    public Item getItemById(Long itemId) {
        return itemRepository.findById(itemId).orElseThrow(() -> new NoSuchElementException("Item ID:" +
                itemId + " was not found"));
    }

    @Override
    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }

    // Update
    @Override
    public Item updateItem(Item item, Long itemId) {
        Item existingItem = itemRepository.findById(itemId).orElseThrow(() ->
                new NoSuchElementException("Item ID: " + itemId + " was not found") );
        existingItem.setItemName(item.getItemName());
        existingItem.setItemDescription(item.getItemDescription());
        return itemRepository.save(existingItem);
    }

    // Delete
    @Override
    public void deleteItemById(Long itemId) {
        itemRepository.deleteById(itemId);
    }
}
