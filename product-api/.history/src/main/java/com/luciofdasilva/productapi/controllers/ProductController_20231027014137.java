package com.luciofdasilva.productapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.luciofdasilva.productapi.services.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> getProducts() {
        List<ProductDto> productDtos = productService.getAll();
        return p

    }
}
