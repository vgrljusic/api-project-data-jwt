package com.vgrljusic.springbootstarter.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> getAllShops() {
        List<Shop> shops = new ArrayList<>();
        shopRepository.findAll()
                .forEach(shops::add);
        return shops;
    }

    public Shop getShop(String id) {
        return shopRepository.findById(id).get();
    }

    public void addShop(Shop shop) {
        shopRepository.save(shop);
    }

    public void updateShop(String id, Shop shop) {
        shopRepository.save(shop);
    }

    public void deleteShop(String id) {
        shopRepository.deleteById(id);
    }







}
