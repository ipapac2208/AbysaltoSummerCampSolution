package com.example.demo.service;
import java.util.List;
import com.example.demo.dto.Product;
import com.example.demo.dto.ProductResponse;
import org.springframework.web.client.RestClient;
import org.springframework.stereotype.Service;
import org.springframework.core.ParameterizedTypeReference;

@Service
public class ProductService {
    private final RestClient restClient;
    public ProductService(RestClient restClient) {
        this.restClient = restClient;
    }
    public List<Product> getProducts() {
        return restClient.get().uri("/products").retrieve().body(new ParameterizedTypeReference<List<Product>>() {});
    }
    public Product getProductsById(Integer id) {
        return restClient.get().uri("/products/{id}", id).retrieve().body(Product.class);
    }
    public ProductResponse search(String query) {
        return restClient.get().uri(uriBuilder -> uriBuilder.path("/products/search").queryParam("q", query).build()).retrieve().body(ProductResponse.class);
    }
}
