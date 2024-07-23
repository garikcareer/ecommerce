package com.ecommerce.ecommercebackend.services;

import com.ecommerce.ecommercebackend.models.Product;
import com.ecommerce.ecommercebackend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Create
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Read
    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new NoSuchElementException("Product ID:" +
                productId + " was not found"));
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    // Update
    @Override
    public Product updateProduct(Product product, Long productId) {
        Product existingProduct = productRepository.findById(productId).orElseThrow(() ->
                new NoSuchElementException("Product ID: " + productId + " was not found") );
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductDescription(product.getProductDescription());
        return productRepository.save(existingProduct);
    }

    // Delete
    @Override
    public void deleteProductById(Long productId) {
        productRepository.deleteById(productId);
    }
}
