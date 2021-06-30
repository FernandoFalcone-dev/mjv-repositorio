package com.fernando.cadastro.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cadastro {
    @Id
    @Column(nullable = false)
    private String id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 14, nullable = false, unique = true)
    private Long cpfCnpj;
    @Column(length = 12, nullable = false)
    private Long rg;
    @Column(length = 2, nullable = false)
    private String sexo;
    @Column(length = 5, nullable = false)
    private String nacionalidade;
    @Column(nullable = false)
    private LocalDate data_nascimento;
    
    @OneToOne
    @JoinColumn(name = "cd_endereco")
    private Endereco endereco;
    //Reorganizar o mapeamento
    //private Contato contato;



    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpfCnpj() {
        return this.cpfCnpj;
    }

    public void setCpfCnpj(Long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Long getRg() {
        return this.rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getData_nascimento() {
        return this.data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

   /*  public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return this.contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    } */
    

}