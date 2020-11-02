package com.vgrljusic.springbootstarter.item;

import com.vgrljusic.springbootstarter.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/shops/{shopId}/customers/{id}/items")
    public List<Item> getAllItems(@PathVariable String id) {
        return itemService.getAllItems(id);
    }

    @RequestMapping("/shops/{shopId}/customers/{customerId}/items/{id}")
    public Item getItem(@PathVariable String id) {
        return itemService.getItem(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/shops/{shopId}/customers/{customerId}/items")
    public void addItem(@RequestBody Item item, @PathVariable String customerId) {
        item.setCustomer(new Customer(customerId, "", "", ""));
        itemService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/shops/{shopId}/customers/{customerId}/items/{id}")
    public void updateItem(@RequestBody Item item, @PathVariable String customerId, @PathVariable String id) {
        item.setCustomer(new Customer(customerId, "", "", ""));
        itemService.updateItem(item);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/shops/{shopId}/customers/{customerId}/items/{id}")
    public void deleteItem(@PathVariable String id) {
         itemService.deleteItem(id);
    }
}
