package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.Item_repository;
import com.example.demo.service.Item_service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements Item_service {

    @Autowired
    private Item_repository itemRepository;

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(Long id, Item updatedItem) {
        Optional<Item> existingItem = itemRepository.findById(id);
        if (existingItem.isPresent()) {
            Item item = existingItem.get();
            item.setName(updatedItem.getName());
            item.setManufacturing(updatedItem.getManufacturing());
            item.setExpiry(updatedItem.getExpiry());
            item.setPrice(updatedItem.getPrice());
            item.setCategory(updatedItem.getCategory());
            return itemRepository.save(item);
        } else {
            return null;
        }
    }

    @Override
    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}