package com.luciofdasilva.productapi.DTO;

import com.luciofdasilva.productapi.models.Category;
import com.luciofdasilva.productapi.models.Product;
import com.luciofdasilva.shoppingclient.dto.CategoryDTO;
import com.luciofdasilva.shoppingclient.dto.ProductDTO;

import jakarta.validation.constraints.NotNull;

public class DTOConverter {

    public static CategoryDTO convert(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setNome(category.getNome());
        return categoryDTO;
    }

    public static ProductDTO convert(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setNome(product.getNome());
        productDTO.setPreco(product.getPreco());
        productDTO.setProductIdentifier(product.getProductIdentifier());
        productDTO.setDescricao(product.getDescricao());
        if(product.getCategory() != null) {
            productDTO.setCategoryDTO(DTOConverter.convert(product.getCategory()));
        }
        return productDTO;
    }
}
