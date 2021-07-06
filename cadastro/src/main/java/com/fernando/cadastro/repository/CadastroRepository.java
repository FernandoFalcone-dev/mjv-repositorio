package com.fernando.cadastro.repository;

import com.fernando.cadastro.model.Cadastro;

import org.springframework.data.repository.CrudRepository;

public interface CadastroRepository extends CrudRepository<Cadastro, Integer> {
    
}
