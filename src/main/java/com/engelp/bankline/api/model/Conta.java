package com.engelp.bankline.api.model;

public class Conta {
    private Long numero;
    private Double saldo;

    public Long getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
