package com.ecommerce.ecommercebackend.repositories;

import com.ecommerce.ecommercebackend.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
