package com.engelp.bankline.api.repository;

import com.engelp.bankline.api.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

    public List<Movimentacao> findByIdConta(Integer idConta);
}
