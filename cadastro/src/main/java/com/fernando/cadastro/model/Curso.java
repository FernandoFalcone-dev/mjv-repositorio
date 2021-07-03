package com.fernando.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fernando.cadastro.model.enums.Nivel;

@Entity
@Table(name = "tab_curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer cargaHoraria;
    @Enumerated(EnumType.STRING)
    private Nivel nivel;
    

    public Integer getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Nivel getNivel() {
        return this.nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
    
}
