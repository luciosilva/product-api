package com.luciofdasilva.productapi.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciofdasilva.productapi.DTO.DTOConverter;
import com.luciofdasilva.productapi.models.Product;
import com.luciofdasilva.productapi.repositories.CategoryRepository;
import com.luciofdasilva.productapi.repositories.ProductRepository;
import com.luciofdasilva.shoppingclient.dto.ProductDTO;
import com.luciofdasilva.shoppingclient.exception.CategoryNotFoundException;
import com.luciofdasilva.shoppingclient.exception.ProductNotFoundException;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    public List<ProductDTO> getAll() {
        List<Product> products = productRepository.findAll();
        return products
        .stream()
        .map(DTOConverter::convert)
        .collect(Collectors.toList());
    }

    public List<ProductDTO> getProductByCategoryId(Long categoryId) {
        List<Product> products = productRepository.getProductByCategory(categoryId);
        return products
        .stream()
        .map(DTOConverter::convert)
        .collect(Collectors.toList());
    }

    public ProductDTO findByProductIdentifier(String productIdentifier) {
        Product product = productRepository.findByProductIdentifier(productIdentifier);
        if(product != null){
            return DTOConverter.convert(product);
        }
        throw new ProductNotFoundException();
    }

	public ProductDTO save(ProductDTO productDTO) {
		Boolean existsCategory = categoryRepository.existsById(productDTO.getCategoryDTO().getId());
		if (!existsCategory) {
			throw new CategoryNotFoundException();
		}
		Product product = productRepository.save(Product.convert(productDTO));
		return DTOConverter.convert(product);
	}


    public void delete(long productId) {
        Optional<Product> product =
        productRepository.findById(productId);
        if(product.isPresent()){
            productRepository.delete(product.get());
        }
        throw new ProductNotFoundException();
    }
}
