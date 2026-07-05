package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductDetailPageController {
    private final ProductService productService;

    public ProductDetailPageController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products-page/{id}")
    public String productDetails(@PathVariable Integer id, Model model) {
        Product product = productService.getProductsById(id);
        model.addAttribute("product", product);
        return "productDetails";
}
}
