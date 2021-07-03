package com.fernando.cadastro.repository;

import java.util.List;

import com.fernando.cadastro.model.Curso;

import org.springframework.data.repository.CrudRepository;


public interface CursoRepository extends CrudRepository<Curso, Integer> {  
    List<Curso> findByNomeContaining(String nome);
}