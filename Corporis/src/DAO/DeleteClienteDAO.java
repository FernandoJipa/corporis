package DAO;

import java.sql.*;

import Conexoes.ConexaoMySQL;
import Confirmacoes.CadastroRemovido;
import RegrasDeNegocio.DeleteCliente;

public class DeleteClienteDAO  {
	private ConexaoMySQL conex = new ConexaoMySQL();
	private PreparedStatement stmt;
	private Connection con = null;

	public void apagarRegistro(DeleteCliente dc) {
		
		String sql = "DELETE FROM cliente WHERE cod_cli ="+dc.getID()+"";

		try {
			conex.conectar();
			con = conex.getCon();
			stmt = con.prepareStatement(sql);
			stmt.execute();
			CadastroRemovido cr = new CadastroRemovido();
			cr.setVisible(true);
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}