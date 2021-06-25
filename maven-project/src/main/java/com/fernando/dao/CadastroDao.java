package com.fernando.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.fernando.conection.FabricaConexao;
import com.fernando.model.Cadastro;



public class CadastroDao {
	private Connection cnn;
	
	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
	public void incluir(Cadastro cadastro) {
		try {
			String sql= "INSERT INTO cadastro (nome,telefone) VALUES (?,?);";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, cadastro.getNome());
			st.setLong(2, cadastro.getTelefone());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//IMPLEMENTAR
	public void alterar(Cadastro cadastro) {
		try {
			String sql= "UPDATE cadastro (nome,telefone) VALUES (?,?);";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, cadastro.getNome());
			st.setLong(2, cadastro.getTelefone());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void excluir() {
		
	}
	public List<Cadastro> listar() {
		return null;
	}
	public Cadastro buscar() {
		return null;
	}
}
