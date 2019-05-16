package com.jsmu.exercise.services;

import com.jsmu.exercise.entities.Product;
import com.jsmu.exercise.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JPAProductManager implements ProductManager {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> read(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public List<Product> readAll() {
        return (List<Product>) productRepository.findAll();
    }
}
