package com.vgrljusic.springbootstarter.item;

import com.vgrljusic.springbootstarter.customer.Customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {

    @Id
    private String id;
    private String price;
    private String description;

    @ManyToOne
    private Customer customer;

    public Item() {

    }

    public Item(String id, String price, String description, String customerId) {
        super();
        this.id = id;
        this.price = price;
        this.description = description;
        this.customer = new Customer(customerId, "", "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
