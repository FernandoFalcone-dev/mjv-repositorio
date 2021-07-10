package com.fernando.cadastro.model.enums;

public enum Sexo {
    F("FEMININO"),
    M("MASCULINO");

    private String nome;
    
    private Sexo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}