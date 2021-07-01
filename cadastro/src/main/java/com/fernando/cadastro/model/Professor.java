package com.fernando.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_professor")
public class Professor {
	@Id
	private Integer id;
}