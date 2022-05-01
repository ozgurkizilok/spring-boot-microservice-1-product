package com.khaleesi.springbootmicroserviceproduct.repository;

import com.khaleesi.springbootmicroserviceproduct.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
