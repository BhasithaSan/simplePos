package com.github.BhasithaSan.ecommerce.Model.Product;
import jakarta.persistence.*;

@Entity
public  class Product {
     @Id
     @Column(name="PRODUCTID")
     private String id;
    private String category;
    private String name;
    @Column(name="UNITPRICE")
    private float unitPrice;

    private String brand;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
