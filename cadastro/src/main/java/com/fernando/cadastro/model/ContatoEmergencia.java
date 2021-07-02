package com.fernando.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.fernando.cadastro.model.enums.GrauParentesco;

@Embeddable
public class ContatoEmergencia {
	@Column(name =  "ce_nome", length = 30)
	private String nome;
	@Column(name =  "ce_email", length = 70)
	private String email;
	@Enumerated(EnumType.STRING)
	@Column(name =  "ce_parentesco", length = 10)
	private GrauParentesco parentesco;
	@Column(name =  "ce_telefone",length = 20)
	private Long telefone;


	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public GrauParentesco getParentesco() {
		return this.parentesco;
	}

	public void setParentesco(GrauParentesco parentesco) {
		this.parentesco = parentesco;
	}

	public Long getTelefone() {
		return this.telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	
	
}

