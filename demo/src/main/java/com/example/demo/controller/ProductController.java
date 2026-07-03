package com.example.demo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Product;
import com.example.demo.dto.ProductResponse;
import com.example.demo.service.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productService.getProductsById(id);
    }
    @GetMapping("/search")
    public ProductResponse search(@RequestParam String query) {
        return productService.search(query);
    }
    @GetMapping("/filter")
    public List<Product> filter(@RequestParam String category) {
        return productService.filter(category);
    }
    @GetMapping("/filter/{price}")
    public List<Product> filterByPrice(@PathVariable Double price) {
        return productService.filterByPrice(price);
    }
}
