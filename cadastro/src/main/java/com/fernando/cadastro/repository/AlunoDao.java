package com.fernando.cadastro.repository;

import com.fernando.cadastro.model.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {  

}
