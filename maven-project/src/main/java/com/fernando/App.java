package com.fernando;

import com.fernando.dao.CadastroDao;
import com.fernando.model.Cadastro;

public class App 
{
    public static void main( String[] args ){
        CadastroDao dao = new CadastroDao();
		
		
		Cadastro cadastro = new Cadastro();
		cadastro.setNome("Fernando");
		cadastro.setTelefone(98098976543l);
		dao.incluir(cadastro);
    }
}
