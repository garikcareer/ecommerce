package com.ecommerce.ecommercebackend.services;

import com.ecommerce.ecommercebackend.models.Item;
import com.ecommerce.ecommercebackend.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

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
        Optional<Item> productOptional = itemRepository.findById(itemId);
        if (productOptional.isPresent()) {
            return productOptional.get();
        } else {
            throw new NoSuchElementException("No such item with " + itemId);
        }
    }

    @Override
    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }

    // Update
    @Override
    public Item updateItem(Item item, Long itemId) {
        Optional<Item> optionalItem = itemRepository.findById(itemId);

        if (optionalItem.isPresent()) {
            Item itemToUpdate = optionalItem.get();
            if (Objects.nonNull(item.getItemTitle()) && !"".equalsIgnoreCase(item.getItemTitle())) {
                itemToUpdate.setItemTitle(item.getItemTitle());
            }
            // Add more to edit columns
            return itemRepository.save(itemToUpdate);
        }
        return null;
    }

    // Delete
    @Override
    public boolean deleteItemById(Long itemId) {
        itemRepository.deleteById(itemId);
        return true;
    }
}
