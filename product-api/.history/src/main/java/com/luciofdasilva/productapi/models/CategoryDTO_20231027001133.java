package com.luciofdasilva.productapi.models;

import jakarta.validation.constraints.NotNull;

public class CategoryDTO {
    
    @NotNull
    private Long id;
    private String nome;

    
}
