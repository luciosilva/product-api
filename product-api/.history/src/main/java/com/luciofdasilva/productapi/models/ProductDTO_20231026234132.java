package com.luciofdasilva.productapi.models;

import org.antlr.v4.runtime.misc.NotNull;

public class ProductDTO {
    @NotBlank
    private String productIdentifier;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotNull
}
