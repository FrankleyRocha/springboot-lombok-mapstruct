package com.example.demo.domain.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProdutoDTO {

    private UUID id;
    private String descricao;

}