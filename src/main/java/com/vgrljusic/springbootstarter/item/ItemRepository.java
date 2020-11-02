package com.vgrljusic.springbootstarter.item;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, String> {

    public List<Item> findByCustomerId(String customerId);

}
