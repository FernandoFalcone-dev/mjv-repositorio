package com.fernando.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    public Connection criarConexao(){
        String url = "jdbc:mysql://localhost/mjv_db";
		String user = "root";
		String password = "root";
		Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Sucesso");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
