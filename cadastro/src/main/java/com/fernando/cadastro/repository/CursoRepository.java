package com.fernando.cadastro.repository;

import java.util.List;

import com.fernando.cadastro.model.Curso;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CursoRepository extends JpaRepository<Curso, Integer> {  
    List<Curso> findByNomeContaining(String nome);
}