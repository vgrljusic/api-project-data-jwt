package com.vgrljusic.springbootstarter.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(String shopId) {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findByShopId(shopId)
                .forEach(customers::add);
        return customers;
    }

    public Customer getCustomer(String id) {
        return customerRepository.findById(id).get();
    }

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }







}
