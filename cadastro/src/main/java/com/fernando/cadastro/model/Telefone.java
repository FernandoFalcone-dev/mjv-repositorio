package com.fernando.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tab_telefone")
public class Telefone {
	@Id
	private Integer id;
	private Integer ddd;
	private Long numero;
	
	@ManyToOne
	@JoinColumn(name = "cad_map")
	private Cadastro cadastro;
	
	//JPQL
	
}