package br.fib.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectBD {

	public static void main(String[] args) throws SQLException {
		// 1º) Obtenha uma conexão;
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/", "sa", "");

		// 2º) Envie um SQL por meio da conexão
		String sql = "insert into autor (id_autor,autor_nome,autor_cidade) values (?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);

		// preenche os valores
		stmt.setInt(1, 1);
		stmt.setString(2, "claudio");
		stmt.setString(3, "bauru");

		// executa o sql
		stmt.execute();

		// 3º) Feche a conexão
		stmt.close();
		connection.close();
	}
}