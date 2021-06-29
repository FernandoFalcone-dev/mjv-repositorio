package com.fernando.transmissao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class Transmissor {
    @Autowired
	private ContatoDao dao;
	
	@Autowired
	private Gson gson;
	
	public void enviar(Integer id, String mensagem) {
		Contato contato = dao.find(id);
		
		String json = gson.toJson(contato);
		
		System.out.println(json);
		
		System.out.println("Enviando mensagem para o numero:" + contato.getTelefone());
		System.out.println(String.format("Ola %s,\n%s", contato.getNome(), mensagem));
    }
}
