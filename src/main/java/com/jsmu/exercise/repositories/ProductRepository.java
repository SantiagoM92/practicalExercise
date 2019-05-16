package com.jsmu.exercise.repositories;

import com.jsmu.exercise.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
