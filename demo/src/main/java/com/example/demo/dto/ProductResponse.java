package com.example.demo.dto;
import java.util.List;

import com.example.demo.entity.Product;


public class ProductResponse {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }
    
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}