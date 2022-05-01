package com.khaleesi.springbootmicroserviceproduct.service;

import com.khaleesi.springbootmicroserviceproduct.model.Product;
import com.khaleesi.springbootmicroserviceproduct.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class ProductService {

    private final ProductRepository productRepository;;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    public void deleteProduct(Long productId){
         productRepository.deleteById(productId);
    }

    public List<Product> findAllProducts(){
        return (List<Product>) productRepository.findAll();
    }
}
