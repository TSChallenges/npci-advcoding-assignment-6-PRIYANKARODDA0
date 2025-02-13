package com.mystore.app;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
class Product {
    
    private int id;
    private String name;
    private String barcode;

    
    @Autowired
    public Product(Barcode barcode) {
        this.id = 1001; // Example ID
        this.name = "SampleProduct"; // Example Name
        this.barcode = barcode.createBarcode(this);
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    // public void setBardCode(){
    // this.barcode = barcode.createBarcode()
    // }
    
    @Override
    public String toString() {
        return "Product{name='" + name + "', barcode='" + barcode + "'}";
    }

}