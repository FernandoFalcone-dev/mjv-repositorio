package com.fernando;

import com.fernando.dao.CadastroDao;

import com.fernando.model.Tab_cliente;

public class App 
{
    public static void main( String[] args ){
        CadastroDao dao = new CadastroDao();

		Tab_cliente tab_cliente = new Tab_cliente();
		/* tab_cliente.setCodigo(1);
		tab_cliente.setPf_pj("J");
		tab_cliente.setRazao_social_nome("SUPERMERCADO BOM DIA");
		tab_cliente.setCpf_cnpj("57896346587921");
		tab_cliente.setTelefone1(985647525L);
		tab_cliente.setEmail("sbomdia@gmail.com");
		tab_cliente.setAtividade_prof("Varejo");
		tab_cliente.setCep("62720546");
		tab_cliente.setEstado("PE");
		tab_cliente.setCidade("Olinda");
		tab_cliente.setRua("Rua das Flores");
		tab_cliente.setNumero("87B");
		tab_cliente.setComplemento("casa");
		tab_cliente.setBairro("Maravilha");
		tab_cliente.setSite_instagram(null);
		dao.incluir(tab_cliente); */
		
		/* tab_cliente.setRazao_social_nome("SUPERMERCADO BOA TARDE");
		tab_cliente.setTelefone1(965784236L);
		dao.alterar(tab_cliente); */

		/* tab_cliente.setCodigo(1);
		dao.excluir(tab_cliente); */

		System.out.println(dao.listar()); 


		
    }
}
