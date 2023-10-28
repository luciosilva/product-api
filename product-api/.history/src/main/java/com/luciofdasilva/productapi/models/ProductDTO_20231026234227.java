package com.luciofdasilva.productapi.models;

import javax
import jakarta.

public class ProductDTO {
    @NotBlank
    private String productIdentifier;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotNull
}
