package com.fernando.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.fernando.conection.FabricaConexao;

import com.fernando.model.Tab_cliente;



public class CadastroDao {
	private Connection cnn;
	
	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
	public void incluir(Tab_cliente tab_cliente) {
		try {
			String sql= "INSERT INTO tab_cliente (codigo, pf_pj,razao_social_nome,cpf_cnpj, telefone1,email,atividade_prof,cep,estado,cidade,rua,numero,complemento,bairro,site_instagram) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, tab_cliente.getCodigo());
			st.setString(2, tab_cliente.getPf_pj());
			st.setString(3, tab_cliente.getRazao_social_nome());
			st.setString(4, tab_cliente.getCpf_cnpj());
			st.setLong(5, tab_cliente.getTelefone1());
			st.setString(6, tab_cliente.getEmail());
			st.setString(7, tab_cliente.getAtividade_prof());
			st.setString(8, tab_cliente.getCep());
			st.setString(9, tab_cliente.getEstado());
			st.setString(10, tab_cliente.getCidade());
			st.setString(11, tab_cliente.getRua());
			st.setString(12, tab_cliente.getNumero());
			st.setString(13, tab_cliente.getComplemento());
			st.setString(14, tab_cliente.getBairro());
			st.setString(15, tab_cliente.getSite_instagram());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//IMPLEMENTAR
	public void alterar(Tab_cliente tab_cliente) {
		try {
			String sql = "UPDATE tab_cliente "
                + "SET razao_social_nome = ?, telefone1 = ? "
                + "WHERE Codigo = 1";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, tab_cliente.getRazao_social_nome());
			st.setLong(2, tab_cliente.getTelefone1());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/*public void excluir() {
		try {
					
			String sql= "DELETE tab_cadastro WHERE id = ? ";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
			st.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Cadastro> listar() {
		List<Cadastro> lista = new ArrayList<Cadastro>();
		try {
			String sql= "SELECT * FROM tab_cadastro";
			
			PreparedStatement st = cnn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Cadastro c = new Cadastro();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setTelefone(rs.getLong("telefone"));
				lista.add(c);
			}
			
			st.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	public Cadastro buscar() {
		Cadastro c = null;
		try {
			String sql= "SELECT * FROM tab_cadastro WHERE id = ?";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				c = new Cadastro();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setTelefone(rs.getLong("telefone"));
			}
			
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  c; 
	}*/
}
