package com.example.demo.dto;

import org.mapstruct.Mapper;

import com.example.demo.domain.Produto;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    ProdutoDTO toDto(Produto produto);
    Produto toEntity(ProdutoDTO produtoDTO);

}