package com.fernando.transmissao;

import org.springframework.stereotype.Repository;
@Repository
public class ContatoDao {
    public Contato find(Integer id) {
		Contato contato = new Contato();
		contato.setNome("Fernando");
		contato.setTelefone(81965874523l);
		return contato;
	}
}
