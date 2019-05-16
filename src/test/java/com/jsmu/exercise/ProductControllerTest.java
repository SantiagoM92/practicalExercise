package com.jsmu.exercise;

import com.jsmu.exercise.config.SpringappBusinessConfig;
import com.jsmu.exercise.config.SpringappWebConfig;
import com.jsmu.exercise.controllers.ProductController;
import com.jsmu.exercise.entities.Product;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

//This test running with registers in products table
@Ignore
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SpringappBusinessConfig.class, SpringappWebConfig.class})
@WebAppConfiguration
public class ProductControllerTest {

    @Autowired
    private ProductController controller;

    @Test
    public void testHandleRequestView() {
        ModelAndView modelAndView = controller.products();
        assertEquals("products", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        @SuppressWarnings("unchecked")
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("productModel");
        List<Product> products = (List<Product>) modelMap.get("products");
        assertNotNull(products);
    }
}
