package com.example.demo.mapper;

import org.mapstruct.Mapper;

import com.example.demo.domain.Produto;
import com.example.demo.dto.ProdutoDTO;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    ProdutoDTO toDto(Produto produto);
    Produto toEntity(ProdutoDTO produtoDTO);

}