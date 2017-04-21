package DAO;

import java.sql.*;

import Conexoes.ConexaoMySQL;
import Confirmacoes.CadastroEfetuado;
import RegrasDeNegocio.Cadastro_Cliente;

public class Cadastro_ClienteDAO {
	private ConexaoMySQL conex = new ConexaoMySQL();
	private PreparedStatement stmt;
	private Connection con = null;
	static int idade;

	public static int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		Cadastro_ClienteDAO.idade = idade;
	}

	public void cadastrarCliente(Cadastro_Cliente cc) {
		String sql = "INSERT INTO cliente (cli_nome, cli_datanas, cli_sexo, cli_endereco, cli_bairro, cli_cpf, cli_etnia, cli_cidade, cli_uf, cli_telefone,cli_responsavel, cli_email, cli_classificacao,cli_observacoes) values ('"
				+ cc.getNome() + "', (STR_TO_DATE('" + cc.getDataNascimento() + "', '%d/%m/%Y')), '" + cc.getSexo()
				+ "', '" + cc.getEndereco() + "', '" + cc.getBairro() + "', '" + cc.getCpf() + "', '" + cc.getEtnia()
				+ "', '" + cc.getCidade() + "', '" + cc.getUf() + "', '" + cc.getTelefone() + "', '"
				+ cc.getResponsavel() + "', '" + cc.getEmail() + "', '" + cc.getClassificacao() + "', '"
				+ cc.getObservacoes() + "')";

		try {
			conex.conectar();
			con = conex.getCon();
			stmt = con.prepareStatement(sql);
			stmt.execute();
			CadastroEfetuado ce = new CadastroEfetuado();
			ce.setVisible(true);
			stmt.close();
			ce.setVisible(false);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}