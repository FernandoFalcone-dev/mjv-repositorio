package com.fernando.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fernando.cadastro.model.enums.AlunoNivel;


@Entity
@Table(name = "tab_aluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 3)
	private AlunoNivel nivel;
	
	@OneToOne
	@JoinColumn(name = "cd_cadastro", foreignKey = @ForeignKey(name = "fk_aluno_cadastro"))
	private Cadastro cadastro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AlunoNivel getNivel() {
		return nivel;
	}

	public void setNivel(AlunoNivel nivel) {
		this.nivel = nivel;
	}
	
}