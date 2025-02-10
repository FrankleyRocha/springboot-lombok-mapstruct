package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Produto;
import com.example.demo.dto.ProdutoDTO;
import com.example.demo.service.ProdutoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/produtos")
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoService service;

    @GetMapping
    public List<ProdutoDTO> listar() {
        return service.listarTodos();
    }

    // @GetMapping("/{nome}")
    // public ProdutoDTO buscarPorNome(@PathVariable String nome) {
    //     return service.buscarPorNome(nome);
    // }

    @PostMapping
    public ProdutoDTO salvar(@RequestBody ProdutoDTO Produto) {
        return service.salvar(Produto);
    }

    // @DeleteMapping("/{id}")
    // public void deletar(@PathVariable Long id) {
    //     service.deletar(id);
    // }

}
