package com.vgrljusic.springbootstarter.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping("/shops")
    public List<Shop> getAllShop() {
        return shopService.getAllShops();
    }

    @RequestMapping("/shops/{id}")
    public Shop getShop(@PathVariable String id) {
        return shopService.getShop(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/shops")
    public void addShop(@RequestBody Shop shop) {
        shopService.addShop(shop);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/shops/{id}")
    public void updateShop(@RequestBody Shop shop, @PathVariable String id) {
        shopService.updateShop(id, shop);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/shops/{id}")
    public void deleteShop(@PathVariable String id) {
         shopService.deleteShop(id);
    }
}
