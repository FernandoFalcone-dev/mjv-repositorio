package com.fernando.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterar(Tab_cliente tab_cliente) {
		try {
			String sql = "UPDATE tab_cliente "
                + "SET razao_social_nome = ?, telefone1 = ? "
                + "WHERE Codigo = ?";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, tab_cliente.getRazao_social_nome());
			st.setLong(2, tab_cliente.getTelefone1());
			st.setInt(3, tab_cliente.getCodigo());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void excluir(Integer codigo) {
		try {
					
			String sql= "DELETE FROM tab_cliente WHERE codigo = ? ";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, codigo);
			st.executeUpdate();
			st.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Tab_cliente> listar() {
		List<Tab_cliente> lista = new ArrayList<Tab_cliente>();
		try {
			String sql= "SELECT * FROM tab_cliente";
			
			PreparedStatement st = cnn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Tab_cliente cliente = new Tab_cliente();
				cliente.setCodigo(rs.getInt("codigo"));
				cliente.setPf_pj(rs.getString("pf_pj"));
				cliente.setRazao_social_nome(rs.getString("razao_social_nome"));
				cliente.setCpf_cnpj(rs.getString("cpf_cnpj"));
				cliente.setTelefone1(rs.getLong("telefone1"));
				cliente.setEmail(rs.getString("email"));
				cliente.setAtividade_prof(rs.getString("atividade_prof"));
				cliente.setCep(rs.getString("cep"));
				cliente.setEstado(rs.getString("estado"));
				cliente.setCidade(rs.getString("cidade"));
				cliente.setRua(rs.getString("rua"));
				cliente.setRua(rs.getString("numero"));
				cliente.setComplemento(rs.getString("complemento"));
				cliente.setBairro(rs.getString("bairro"));
				cliente.setSite_instagram("site_instagram");
				lista.add(cliente);
			}

			st.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	public Tab_cliente buscar(Integer codigo) {
		Tab_cliente cliente = null;
		try {
			String sql= "SELECT razao_social_nome,email,atividade_prof FROM tab_cliente WHERE codigo = ?";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, codigo);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				cliente = new Tab_cliente();
				cliente.setRazao_social_nome(rs.getString("razao_social_nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setAtividade_prof(rs.getString("atividade_prof"));
			}
			
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  cliente; 
	}
}
