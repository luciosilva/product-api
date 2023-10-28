package com.luciofdasilva.productapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public List<ProductDTO > getProductByCategory(@PathVariable Long categoryId) {
        List<ProductDTO> products = productService.getProductByCategory(categoryId);
        return products;
    }

    @GetMapping("/product/{productIdentifier}")
    public ProductDTO findById(@PathVariable String productIdentifier) {
        return productService.findByProductIdentifier(productIdentifier);
    }

    @PostMapping("/product")
    ProductDTO newProduct(@RequestBody ProductDTO productDTO) {
        return productService.save(productDTO);
     }

     @DeleteMapping("/product/{id}")
     void delete(@PathVariable Long id) {
        productService.delete(id);
      }
}
