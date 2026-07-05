package com.example.demo.service;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.example.demo.dto.ProductResponse;
import com.example.demo.entity.Product;

@Service
public class ProductService {
    private final RestClient restClient;
    public ProductService(RestClient restClient) {
        this.restClient = restClient;
    }
    public List<Product> getProducts() {
    Product[] products = restClient.get()
            .uri("/products")
            .retrieve()
            .body(Product[].class);

    return Arrays.asList(products);
}
    public Product getProductsById(Integer id) {
    List <Product> products = Arrays.asList(restClient.get()
            .uri("/products/{id}", id)
            .retrieve()
            .body(Product[].class));
    
    return products.stream()
        .filter(product -> product.getId().equals(id))
        .findFirst()
        .orElse(null);}

    public List<Product> search(String query) {
    Product[] response = restClient.get()
            .uri("/products")
            .retrieve()
            .body(Product[].class);

    return Arrays.stream(response)
            .filter(p -> p.getIme().toLowerCase().contains(query.toLowerCase()))
            .toList();
}
    public List<Product> filter(String category) {
    String json = restClient.get()
    .uri("/products/categories/{category}?q=test", category)
    .retrieve()
    .body(String.class);
    System.out.println(json);
        return restClient.get()
        .uri("/products/categories/{category}", category)
        .retrieve()
        .body(ProductResponse.class).getProducts();
}

public List<Product> filterByPrice(Double price) {
    String json = restClient.get()
    .uri("/products/filter/{price}?q=test", price)
    .retrieve()
    .body(String.class);

    System.out.println(json);
    return restClient.get().uri(
        uriBuilder -> uriBuilder.path(
            "/products/filter/{price}")
            .build(price)).retrieve().body(
               ProductResponse.class).getProducts();
}
}