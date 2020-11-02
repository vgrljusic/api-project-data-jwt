package com.vgrljusic.springbootstarter.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems(String customerId) {
        List<Item> items = new ArrayList<>();
        itemRepository.findByCustomerId(customerId)
                .forEach(items::add);
        return items;
    }

    public Item getItem(String id) {
        return itemRepository.findById(id).get();
    }

    public void addItem(Item item) {
        itemRepository.save(item);
    }

    public void updateItem(Item item) {
        itemRepository.save(item);
    }

    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }







}
