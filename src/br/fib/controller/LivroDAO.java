package br.fib.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.fib.model.Livro;

public class LivroDAO {

	// a conexão com o banco de dados
	private Connection connection;

	public LivroDAO() {
		this.connection = ConnectBD.getConnection();
	}

	public void inclui(Livro livro) {
		String sql = "insert into Livro (livro_Nome,livro_autor,livro_publicacao,livro_editora,livro_sessao) values (?,?,?,?,)";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, livro.getLivro_Nome());
			stmt.setString(2, livro.getLivro_autor());
			stmt.setString(3, livro.getLivro_publicacao());
			stmt.setString(4, livro.getLivro_editora());
			stmt.setString(5, livro.getLivro_sessao());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualiza(Livro livro) {
		String sql = "update Livro set livro_Nome = ?, livro_autor = ?, livro_publicacao = ?, livro_editora = ?, livro_sessao = ? where id_livro = ?";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, livro.getLivro_Nome());
			stmt.setString(2, livro.getLivro_autor());
			stmt.setString(3, livro.getLivro_publicacao());
			stmt.setString(4, livro.getLivro_editora());
			stmt.setString(5, livro.getLivro_sessao());
			stmt.setInt(6, livro.getId_Livro());

			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void apaga(Livro livro) {
		String sql = "delete from Livro where id_livro = ?";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setInt(6, livro.getId_Livro());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Livro> listaLivros() {

		ArrayList<Livro> lista = new ArrayList<Livro>();

		String sql = "select * from id_livro order by livro_nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Livro livro = new Livro();
				livro.setId_Livro(rs.getInt("id_livro"));
				livro.setLivro_Nome(rs.getString("livro_nome"));
				livro.setLivro_autor(rs.getString("livro_autor"));
				livro.setLivro_publicacao(rs.getString("livro_publicacao"));
				livro.setLivro_editora(rs.getString("livro_editora"));
				livro.setLivro_sessao(rs.getString("livro_sessao"));
				lista.add(livro);
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

	public Livro pegaLivro(Long id) {
		Livro livro = null;
		String sql = "select * from Livro where id_livro = ? order by livro_nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				livro = new Livro();
				livro.setId_Livro(rs.getInt("id_livro"));
				livro.setLivro_Nome(rs.getString("livro_nome"));
				livro.setLivro_autor(rs.getString("livro_autor"));
				livro.setLivro_publicacao(rs.getString("livro_publicacao"));
				livro.setLivro_editora(rs.getString("livro_editora"));
				livro.setLivro_sessao(rs.getString("livro_sessao"));
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return livro;

	}

	public ArrayList<Livro> listaLivrosPorNome(String nome) {

		ArrayList<Livro> lista = new ArrayList<Livro>();

		String sql = "select * from Livro where upper(livro_nome) like upper(?) order by livro_nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, "%" + nome + "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Livro livro = new Livro();
				livro.setId_Livro(rs.getInt("id_livro"));
				livro.setLivro_Nome(rs.getString("livro_nome"));
				livro.setLivro_autor(rs.getString("livro_autor"));
				livro.setLivro_publicacao(rs.getString("livro_publicacao"));
				livro.setLivro_editora(rs.getString("livro_editora"));
				livro.setLivro_sessao(rs.getString("livro_sessao"));
				lista.add(livro);
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
