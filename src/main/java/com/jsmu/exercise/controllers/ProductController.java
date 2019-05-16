package com.jsmu.exercise.controllers;


import com.jsmu.exercise.entities.Product;
import com.jsmu.exercise.services.ProductManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Controller
public class ProductController {

    @Autowired
    ProductManager productManager;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ModelAndView products() {
        log.debug("Returning products ");
        Map<String, Object> productModel = new HashMap<String, Object>();
        productModel.put("products", this.productManager.readAll());
        return new ModelAndView("products", "productModel", productModel);
    }

    @RequestMapping(value = "/product/new", method = RequestMethod.GET)
    public ModelAndView createProduct() {
        log.debug("Create product");
        Optional<Product> productModel = Optional.of(new Product());
        return new ModelAndView("productForm", "productModel", productModel);
    }

    @RequestMapping(value = "/product/edit/{code}", method = RequestMethod.GET)
    public ModelAndView editProduct(@PathVariable("code") Long code) {
        log.debug("Edit product with code " + code);
        Optional<Product> productModel = this.productManager.read(code);
        return new ModelAndView("productForm", "productModel", productModel);
    }

    @RequestMapping(value = "/product/delete/{code}", method = RequestMethod.GET)
    public String delete(@PathVariable("code") Long code) {
        log.debug("Delete product with code " + code);
        Optional<Product> productModel = this.productManager.read(code);
        this.productManager.delete(productModel.get());
        return "redirect:/products";
    }

    @RequestMapping(value = "/product/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("productModel") Product product) {
        log.debug("Save product " + product.toString());
        this.productManager.update(product);
        return "redirect:/products";
    }


}
