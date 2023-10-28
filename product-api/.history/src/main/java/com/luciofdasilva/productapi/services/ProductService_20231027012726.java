package com.luciofdasilva.productapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciofdasilva.productapi.models.Product;
import com.luciofdasilva.productapi.models.ProductDTO;
import com.luciofdasilva.productapi.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getAll() {
        List<Product> products = productRepository.findAll();
        return products
        .stream()
        .map(ProductDTO::convert)
        .collect(Collectors.toList());
    }

    public List<ProductDTO> getProductByCategoryId(Long categoryId) {
        List<Product> products = productRepository.getProductByCategory(categoryId);
        return products
        .stream()
        .map(ProductDTO::convert)
        .collect(Collectors.toList());
    }

    public ProductDTO findBy
}