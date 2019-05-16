package com.jsmu.exercise;

import com.jsmu.exercise.config.SpringappBusinessConfig;
import com.jsmu.exercise.entities.Product;
import com.jsmu.exercise.repositories.ProductRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

//This test running with registers in products table
@Ignore
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SpringappBusinessConfig.class})
public class ProductRepositoryTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void readAllProducts() {
        List<Product> products = (List<Product>) productRepository.findAll();
        assertEquals(products.size(), 3, 0);
    }


}
