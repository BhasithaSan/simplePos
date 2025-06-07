package com.github.BhasithaSan.ecommerce.Model.Customer;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    private String id;

    private String name;

    private String mobile;

    private String address;

    private String city;

    public Customer() {
    }

    public Customer(String id, String name, String mobile, String address, String city) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.city = city;
    }

    // Getters and setters...

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
