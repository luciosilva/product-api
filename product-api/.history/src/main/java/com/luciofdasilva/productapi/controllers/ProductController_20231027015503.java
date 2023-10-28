package com.luciofdasilva.productapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luciofdasilva.productapi.models.Product;
import com.luciofdasilva.productapi.models.ProductDTO;
import com.luciofdasilva.productapi.services.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<ProductDTO> getProducts() {
        List<ProductDTO> products = productService.getAll();
        return products;
    }

    @GetMapping("/product/category/{categoryId}")
}
