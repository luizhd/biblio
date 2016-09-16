package br.fib.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.fib.model.Estudante;

public class EstudanteDAO {
	private Connection connection;

	public EstudanteDAO() {
		this.connection = ConnectBD.getConnection();
	}

	public void inclui(Estudante estudante) {
		String sql = "insert into estudante (estu_nome, estu_curso) values (?,?)";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, estudante.getEstu_nome());
			stmt.setString(2, estudante.getEstu_Curso());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualiza(Estudante estudante) {
		String sql = "update estudante set estu_nome = ?, estu_curso = ? where id_estudante = ?";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, estudante.getEstu_nome());
			stmt.setString(2, estudante.getEstu_Curso());
			stmt.setLong(3, estudante.getId_estu());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void apaga(Estudante estudante) {
		String sql = "delete from estudante where id_estudante = ?";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, estudante.getId_estu());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Estudante> listaEstudantes() {

		ArrayList<Estudante> lista = new ArrayList<Estudante>();

		String sql = "select * from estudante order by estu_nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Estudante estudante = new Estudante();
				estudante.setId_estu(rs.getInt("id_estudante"));
				estudante.setEstu_nome(rs.getString("Estu_nome"));
				estudante.setEstu_Curso(rs.getString("Estu_curso"));
				lista.add(estudante);
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

	public Estudante pegaEstudante(Integer id) {
		Estudante Estudante = null;
		String sql = "select * from Estudante where id_Estudante = ? order by Estudante_nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Estudante = new Estudante();
				Estudante.setId_estu(rs.getInt("id_estudante"));
				Estudante.setEstu_nome(rs.getString("Estu_nome"));
				Estudante.setEstu_Curso(rs.getString("Estu_curso"));
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Estudante;

	}

	public ArrayList<Estudante> listaEstudantesPorNome(String nome) {

		ArrayList<Estudante> lista = new ArrayList<Estudante>();

		String sql = "select * from Estudante where upper(Estudante_nome) like upper(?) order by Estudante_nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, "%" + nome + "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Estudante estudante = new Estudante();
				estudante.setId_estu(rs.getInt("id_estudante"));
				estudante.setEstu_nome(rs.getString("Estu_nome"));
				estudante.setEstu_Curso(rs.getString("Estu_curso"));
				lista.add(estudante);
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
