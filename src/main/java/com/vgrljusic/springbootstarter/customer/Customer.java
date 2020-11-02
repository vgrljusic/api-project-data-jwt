package com.vgrljusic.springbootstarter.customer;

import com.vgrljusic.springbootstarter.shop.Shop;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {

    @Id
    private String id;
    private String address;
    private String email;
    private String geom;

    @ManyToOne
    private Shop shop;

    public Customer() {

    }

    public Customer(String id, String address, String email, String geom) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.geom = geom;
    }

    public Customer(String id, String address, String email, String geom, String shopId) {
        super();
        this.id = id;
        this.address = address;
        this.email = email;
        this.geom = geom;
        this.shop = new Shop(shopId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
