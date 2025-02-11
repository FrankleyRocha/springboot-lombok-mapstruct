package com.example.demo.mapper;

import org.mapstruct.Mapper;

import com.example.demo.domain.dto.ProdutoDTO;
import com.example.demo.domain.entity.Produto;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    ProdutoDTO toDto(Produto produto);
    Produto toEntity(ProdutoDTO produtoDTO);

}