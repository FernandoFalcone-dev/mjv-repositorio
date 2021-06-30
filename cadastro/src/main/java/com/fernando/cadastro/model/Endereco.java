package com.fernando.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {
    @Id
    @Column(length = 16, nullable = false)
    private String cep;
    @Column(length = 50, nullable = false)
    private String rua;
    @Column(length = 5, nullable = false)
    private Integer numero;
    @Column(length = 30)
    private String bairro;
    @Column(length = 30)
    private String cidade;
    @Column(length = 2)
    private String uf;
    @Column(length = 30)
    private String complemento;


    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}