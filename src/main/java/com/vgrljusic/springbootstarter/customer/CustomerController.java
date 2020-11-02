package com.vgrljusic.springbootstarter.customer;

import com.vgrljusic.springbootstarter.shop.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/shops/{id}/customers")
    public List<Customer> getAllCustomers(@PathVariable String id) {
        return customerService.getAllCustomers(id);
    }

    @RequestMapping("/shops/{shopId}/customers/{id}")
    public Customer getCustomer(@PathVariable String id) {
        return customerService.getCustomer(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/shops/{shopId}/customers")
    public void addCustomer(@RequestBody Customer customer, @PathVariable String shopId) {
        customer.setShop(new Shop(shopId, "", ""));
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/shops/{shopId}/customers/{id}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable String shopId, @PathVariable String id) {
        customer.setShop(new Shop(shopId, "", ""));
        customerService.updateCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/shops/{shopId}/customers/{id}")
    public void deleteCustomer(@PathVariable String id) {
         customerService.deleteCustomer(id);
    }
}
