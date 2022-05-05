package com.engelp.bankline.api.dto;

import com.engelp.bankline.api.model.MovimentacaoTipo;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class NovaMovimentacao {

    private String descricao;
    private Double valor;
    private MovimentacaoTipo tipo;
    private Integer idConta;

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public MovimentacaoTipo getTipo() {
        return tipo;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setTipo(MovimentacaoTipo tipo) {
        this.tipo = tipo;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }
}
