package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.dto.ProdutoDTO;
import com.example.demo.mapper.ProdutoMapper;
import com.example.demo.repository.ProdutoRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutoRepo repo;
    private final ProdutoMapper mapper;

    public List<ProdutoDTO> listarTodos() {
        return repo.findAll().stream().map(
            o -> mapper.toDto(o)
        ).toList();
    }

    public ProdutoDTO salvar(ProdutoDTO dto) {
        return mapper.toDto(
            repo.save(
                mapper.toEntity(dto)
            )
        );
    }

}