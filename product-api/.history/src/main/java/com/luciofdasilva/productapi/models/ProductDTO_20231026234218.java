package com.luciofdasilva.productapi.models;

import javax
import jakarta.persistence.Id;

public class ProductDTO {
    @NotBlank
    private String productIdentifier;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotNull
}
