package com.fernando.cadastro.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tab_curso")
public class Curso {
	@Id
	private Integer id;
	
	@OneToMany
	private List<Professor> professores;
}