package DAO;

import java.sql.*;

import Conexoes.ConexaoMySQL;
import Confirmacoes.CadastroAlterado;
import RegrasDeNegocio.UpdateCliente;

public class UpdateClienteDAO {
	private ConexaoMySQL conex = new ConexaoMySQL();
	private PreparedStatement stmt;
	private ResultSet rsDados;
	private Connection con = null;
	private int ID, dia, mes, ano;

	public String getDia() {
		String novo_dia = Integer.toString(dia);
		if (Integer.toString(dia).length() == 1) {
			novo_dia = "0" + dia;
		}
		return novo_dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getMes() {
		String novo_mes = Integer.toString(mes);
		if (Integer.toString(mes).length() == 1) {
			novo_mes = "0" + mes;
		}
		return novo_mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getAno() {
		return Integer.toString(ano);
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void Idade() {
		String sql = "SELECT YEAR(cli_datanas) As ano, MONTH(cli_datanas) As mes, DAY(cli_datanas) As dia FROM cliente WHERE cod_cli = "
				+ getID() + ";";
		try {
			conex.conectar();
			con = conex.getCon();
			stmt = con.prepareStatement(sql);

			rsDados = stmt.executeQuery();

			while (rsDados.next()) {
				setAno(rsDados.getInt("ano"));
				setMes(rsDados.getInt("mes"));
				setDia(rsDados.getInt("dia"));
			}
			stmt.close();
		} catch (Exception e) {

		}
	}

	public void buscaCliente(UpdateCliente uc) {
		String sql = "SELECT cod_cli, cli_nome, cli_datanas, cli_sexo, cli_endereco, cli_bairro, cli_cpf, cli_etnia, cli_cidade, cli_uf, cli_telefone, cli_responsavel, cli_email, cli_classificacao, cli_observacoes FROM cliente WHERE cod_cli = "
				+ getID() + ";";
		try {
			conex.conectar();
			con = conex.getCon();
			stmt = con.prepareStatement(sql);

			rsDados = stmt.executeQuery();

			while (rsDados.next()) {
				uc.setCodigo(rsDados.getInt("cod_cli"));
				uc.setNome(rsDados.getString("cli_nome"));
				uc.setSexo(rsDados.getString("cli_sexo"));
				uc.setEndereco(rsDados.getString("cli_endereco"));
				uc.setBairro(rsDados.getString("cli_bairro"));
				uc.setCpf(rsDados.getString("cli_cpf"));
				uc.setEtnia(rsDados.getString("cli_etnia"));
				uc.setCidade(rsDados.getString("cli_cidade"));
				uc.setUf(rsDados.getString("cli_uf"));
				uc.setTelefone(rsDados.getString("cli_telefone"));
				uc.setResponsavel(rsDados.getString("cli_responsavel"));
				uc.setEmail(rsDados.getString("cli_email"));
				uc.setClassificacao(rsDados.getString("cli_Classificacao"));
				uc.setObservacoes(rsDados.getString("cli_observacoes"));
			}
			stmt.close();
		} catch (Exception e) {

		}
	}

	public void editarCliente(UpdateCliente uc) {
		String sql = "UPDATE cliente SET cli_nome = '" + uc.getNome() + "', cli_datanas = (STR_TO_DATE('"
				+ uc.getDataNascimento() + "', '%d/%m/%Y')), cli_sexo = '" + uc.getSexo() + "', cli_endereco = '"
				+ uc.getEndereco() + "', cli_bairro = '" + uc.getBairro() + "', cli_cpf = '" + uc.getCpf()
				+ "', cli_etnia = '" + uc.getEtnia() + "', cli_cidade = '" + uc.getCidade() + "', cli_uf = '"
				+ uc.getUf() + "', cli_telefone = '" + uc.getTelefone() + "',cli_responsavel = '" + uc.getResponsavel()
				+ "', cli_email = '" + uc.getEmail() + "', cli_classificacao = '" + uc.getClassificacao()
				+ "',cli_observacoes = '" + uc.getObservacoes() + "' WHERE cod_cli = " + getID() + "";

		try {
			conex.conectar();
			con = conex.getCon();
			stmt = con.prepareStatement(sql);
			stmt.execute();
			CadastroAlterado ca = new CadastroAlterado();
			ca.setVisible(true);
			stmt.close();
			ca.setVisible(false);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}