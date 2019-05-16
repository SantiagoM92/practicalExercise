package com.jsmu.exercise;

import com.jsmu.exercise.entities.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ProductTests {

    private Product product;

    @Before
    public void setUp() throws Exception {
        product = new Product();
    }

    @Test
    public void setAndGetProductName() {
        String testDescription = "aName";
        assertNull(product.getName());
        product.setName(testDescription);
        assertEquals(testDescription, product.getName());
    }

}
