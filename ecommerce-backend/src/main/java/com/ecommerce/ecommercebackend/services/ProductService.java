package com.ecommerce.ecommercebackend.services;

import com.ecommerce.ecommercebackend.models.Product;

import java.util.List;

public interface ProductService {
    // Create
    Product addProduct(Product product);

    // Read
    Product getProductById(Long productId);
    List<Product> getAllProducts();

    // Update
    Product updateProduct(Product product, Long productId);

    // Delete
    void deleteProductById(Long productId);
}
