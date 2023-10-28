package com.luciofdasilva.productapi.models;

import jakarta.validation.constraints.NotBlank;

//import javax.

public class ProductDTO {
    @NotBlank
    private String productIdentifier;
//    @NotBlank
    private String nome;
//    @NotBlank
    private String descricao;
//    @NotNull
}
