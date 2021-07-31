package com.brincando.apiany.service;

import com.brincando.apiany.model.Product;
import com.brincando.apiany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public Product save(Product product) {
        return productRepository.save(product);
    }
    
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }
    
    public List<Product> findALL() {
        return productRepository.findAll();
    }
}
