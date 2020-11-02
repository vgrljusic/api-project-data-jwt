package com.vgrljusic.springbootstarter.customer;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    public List<Customer> findByShopId(String shopId);

}
