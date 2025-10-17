package com.example.demo.service;

import com.example.demo.entity.Item;

import java.util.List;

public interface Item_service {
    Item addItem(Item item);
    Item updateItem(Long id, Item updatedItem);
    Item getItemById(Long id);
    List<Item> getAllItems();
    void deleteItem(Long id);
}
