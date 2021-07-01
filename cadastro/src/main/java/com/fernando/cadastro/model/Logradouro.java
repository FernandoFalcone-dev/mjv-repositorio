package com.fernando.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_lougradouro")
public class Logradouro {
	@Id
	private Integer id;
	private String cep;
}
