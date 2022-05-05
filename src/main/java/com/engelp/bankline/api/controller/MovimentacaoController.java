package com.engelp.bankline.api.controller;

import com.engelp.bankline.api.dto.NovaMovimentacao;
import com.engelp.bankline.api.dto.NovoCorrentista;
import com.engelp.bankline.api.model.Correntista;
import com.engelp.bankline.api.model.Movimentacao;
import com.engelp.bankline.api.repository.CorrentistaRepository;
import com.engelp.bankline.api.repository.MovimentacaoRepository;
import com.engelp.bankline.api.service.CorrentistaService;
import com.engelp.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll() {

        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao) {
        service.save(movimentacao);
    }
}
