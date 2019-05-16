package com.jsmu.exercise.services;

import com.jsmu.exercise.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductManager {

    Product create(Product product);

    Optional<Product> read(Long id);

    Product update(Product product);

    void delete(Product product);

    List<Product> readAll();

}
