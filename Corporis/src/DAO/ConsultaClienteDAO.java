package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.AbstractTableModel;

import Conexoes.ConexaoMySQL;

public class ConsultaClienteDAO extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Connection connection;
	private ConexaoMySQL conex = new ConexaoMySQL();
	private Statement statement;
	private ResultSet resultSet;
	private ResultSetMetaData metaData;
	private int numberOfRows;
	
	//Monitora o status da conexao com o banco de dados
	private boolean connectedToDataBase = false;
	
	//contrutor inicializa result set e obtém seu objeto de metadados
	//determina o numero de linhas
	public ConsultaClienteDAO(String query) {
		try{
		//conecta-se ao banco de dados
		conex.conectar();
		connection = conex.getCon();
		
		//cria Statement para consultar o banco de dados
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		//atualiza status da conexão com o banco de dados
		connectedToDataBase = true;
		
		//configura a consulta e a executa
		setQuery(query);
		}catch(Exception erroComando){
			System.out.print (erroComando);
		}
	}//fim do construtor
	
	//obtem a classe que representa o tipo da coluna
	public Class<?> getColumnClass(int colunm) throws IllegalStateException{
		//assegura que a conexao com o banco esta esrtabelecida
		if(!connectedToDataBase)
			throw new IllegalStateException("O banco de dados não está conectato");
		
		//determina a classe JAVA de coluna
		try{
			String className = metaData.getColumnClassName(colunm + 1);
			
			//retorna o objeto class que representa CassName
			return Class.forName(className);
		}//fim do try
		catch(Exception exception){
			exception.printStackTrace();
		}//fim do catch
		
		return Object.class;//se ocorrer ploblemas acima, assume o tipo object	
	}//fim do metodo
	
	//obtém o numero de colunas em ResultSet
	public int getColumnCount() throws IllegalStateException{
		//assegura que a conexao com o banco esta esrtabelecida
		if(!connectedToDataBase)
			throw new IllegalStateException("O banco de dados não está conectato");
		
		//determina o numero de colunas
		try{
			return metaData.getColumnCount();
		}//fim do try
		catch(SQLException sqlException){
			sqlException.printStackTrace();
		}//fim do catch
		
		return 0;//se ocorre problemas acima, retorna 0 como numero de colunas
	}//fim do metodo
	
	//obtem o numero da coluna particular em ResultSet
	public String getColumnName(int column) throws IllegalStateException{
		//assegura que a conexao com o banco esta esrtabelecida
		if(!connectedToDataBase)
			throw new IllegalStateException("O banco de dados não está conectato");
		
		//determina o nome da coluna
		switch (column) {
        case 0:
            return "ID";
        case 1:
            return "NOME";
        case 2:
            return "TELEFONE";
        case 3:
            return /*"N° Avaliações"*/ "CPF";
    }
    return null;
	}//fim do metodo
	
	//retorna o numero de lunhas em ResultSet
	public int getRowCount() throws IllegalStateException{
		//assegura que a conexao com o banco esta esrtabelecida
		if(!connectedToDataBase)
			throw new IllegalStateException("O banco de dados não está conectato");
		
		return numberOfRows;
	}//fim do metodo
	
	public Object getValueAt(int row, int column){	
		//obtem o valor da linha e na coluna especificada no resultset
		try{
			resultSet.absolute(row + 1);
			return resultSet.getObject(column + 1);
		}// fim try
		catch(SQLException sqlexception){
			sqlexception.printStackTrace();
		}// fim catch
		
		return ""; // se ocorrer problemas o retorno sera vazio
	}//fim do metodo
	
	//configura a nova string de consulta do banco de dados
	public void setQuery(String query) throws SQLException, IllegalStateException{
		conex.conectar();
		connection = conex.getCon();
		
		//cria Statement para consultar o banco de dados
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		//atualiza status da conexão com o banco de dados
		connectedToDataBase = true;
		
		//assegura que a conexao com o banco esta esrtabelecida
		if(!connectedToDataBase)
			throw new IllegalStateException("O banco de dados não está conectato");
		
		//especifica a consulta e a executa
		resultSet = statement.executeQuery(query);
		
		//obtem os dados para o resultset
		metaData = resultSet.getMetaData();
		
		//odetermina o numero de linhas em resultset
		resultSet.last(); //move para a ultima linha
		numberOfRows = resultSet.getRow();
		
		//NOTIFICA A TABELA DE QUE O MODELO FOI ALTERADO
		fireTableStructureChanged();
		
	}// fim do setQuery
	
	//fecha statement e conexao
	public void disconnectFromDatBase(){
		if(connectedToDataBase){
			//fecha statement e conexao
			try{
				resultSet.close();
				statement.close();
				connection.close();
			}// fim try
			catch(SQLException sql){
				sql.printStackTrace();
			}//fim catch
			finally{ // atualiza o status da conexão e do banco de dados
				connectedToDataBase = false;
			}// fim de finally
		}// fim do if
	}//fim do metodo

}
