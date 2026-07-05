package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductPageController {
    private final ProductService productService;
    public ProductPageController(ProductService productService) {
        this.productService = productService;
    }
@GetMapping("/products-page")
public String productsPage(
        @RequestParam(required = false) String query,
        @RequestParam(required = false) String category,
        @RequestParam(required = false) Double price,
        Model model) {

    List<Product> products;

    if (query != null && !query.isBlank()) {
        products = productService.search(query);
    } else {
        products = productService.getProducts();
    }

    // CATEGORY FILTER
    if (category != null && !category.isBlank()) {
        products = products.stream()
                .filter(p -> p.getKategorija() != null &&
                        p.getKategorija().toLowerCase().contains(category.toLowerCase()))
                .toList();
    }

    // PRICE FILTER
    if (price != null) {
        products = products.stream()
                .filter(p -> p.getCijena() != null &&
                        p.getCijena() <= price)
                .toList();
    }

    model.addAttribute("products", products);
    return "products";
}
}
