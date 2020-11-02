package com.vgrljusic.springbootstarter.shop;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop {

    @Id
    private String id;
    private String address;
    private String geom;

    public Shop() {

    }

    public Shop(String id, String address, String geom) {
        super();
        this.id = id;
        this.address = address;
        this.geom = geom;
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

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }
}
