package com.ecommerce.ecommercebackend.services;

import com.ecommerce.ecommercebackend.models.Product;
import com.ecommerce.ecommercebackend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Create
    @Override
    public Product addProduct(Product product) {
        if (productRepository.existsById(product.getId())) {
            throw new IllegalArgumentException("Cannot add the product. There is already a product with this id.");
        }
        return productRepository.save(product);
    }

    // Read
    @Override
    public Product getProductById(Long productId) {
        Optional<Product> productOptional = productRepository.findById(productId);
        if (productOptional.isPresent()) {
            return productOptional.get();
        } else {
            throw new NoSuchElementException("No product with this id.");
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    // Update
    @Override
    public Product updateProduct(Product product, Long productId) {
        Optional<Product> optionalCompanyToUpdate = productRepository.findById(productId);

        if (optionalCompanyToUpdate.isPresent()) {
            Product productToUpdate = optionalCompanyToUpdate.get();
            if (Objects.nonNull(product.getName()) && !"".equalsIgnoreCase(product.getName())) {
                productToUpdate.setName(product.getName());
            }
            if (Objects.nonNull(product.getPrice() != product.getPrice())) {
                productToUpdate.setPrice(product.getPrice());
            }
            return productRepository.save(productToUpdate);
        }
        return null;
    }

    // Delete
    @Override
    public boolean deleteProductById(Long companyId) {
        productRepository.deleteById(companyId);
        return true;
    }
}
