package Conexoes;

import java.sql.*;

import javax.swing.JOptionPane;

public class ConexaoMySQL {

	private Connection con;
	private String user = "root", senha = "", url = "jdbc:mysql://localhost:3306/corporis?autoReconnect=true&useSSL=false";
	
	public void conectar(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, senha);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Conexão falhou", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	public Connection getCon(){
		return con;
	}
}
