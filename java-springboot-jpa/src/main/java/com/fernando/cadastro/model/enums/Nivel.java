package com.fernando.cadastro.model.enums;

public enum Nivel {
    IN("INICIANTE"),
	BA("BASICO"),
	IT("INTERMEDIARIO"),
	AV("AVANCADO");

	private String descricao;
	private Nivel(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao(){
		return descricao;
	}
}
