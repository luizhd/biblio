package br.fib.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.fib.model.Autor;

public class AutorDAO {

	private Connection connection;

	public AutorDAO() {
		this.connection = ConnectBD.getConnection();
	}

	public void inclui(Autor autor) {
		String sql = "insert into autor (autor_nome,autor_cidade) values (?,?)";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, autor.getAutor_Nome());
			stmt.setString(2, autor.getAutor_Cidade());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualiza(Autor autor) {
		String sql = "update autor set autor_nome = ?, autor_cidade = ? where idautor = ?";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, autor.getAutor_Nome());
			stmt.setString(2, autor.getAutor_Cidade());
			stmt.setLong(3, autor.getId_Autor());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void apaga(Autor autor) {
		String sql = "delete from autor where id_autor = ?";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, autor.getId_Autor());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Autor> listaautors() {

		ArrayList<Autor> lista = new ArrayList<Autor>();

		String sql = "select * from autor order by autor_nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Autor autor = new Autor();
				autor.setId_Autor(rs.getLong("id_autor"));
				autor.setAutor_Nome(rs.getString("autor_nome"));
				autor.setAutor_Cidade(rs.getString("autor_cidade"));
				lista.add(autor);
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

	public Autor pegaautor(Long id) {
		Autor autor = null;
		String sql = "select * from autor where id_autor = ? order by autor_nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				autor = new Autor();
				autor.setId_Autor(rs.getLong("id_autor"));
				autor.setAutor_Nome(rs.getString("autor_nome"));
				autor.setAutor_Cidade(rs.getString("autor_cidade"));
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return autor;

	}

	public ArrayList<Autor> listaautorsPorNome(String nome) {

		ArrayList<Autor> lista = new ArrayList<Autor>();

		String sql = "select * from autor where upper(autor_nome) like upper(?) order by autor_nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, "%" + nome + "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Autor autor = new Autor();
				autor.setId_Autor(rs.getLong("id_autor"));
				autor.setAutor_Nome(rs.getString("autor_nome"));
				autor.setAutor_Cidade(rs.getString("autor_cidade"));
				lista.add(autor);
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

}
