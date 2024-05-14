package com.ecommerce.ecommercebackend.repositories;

import com.ecommerce.ecommercebackend.models.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
