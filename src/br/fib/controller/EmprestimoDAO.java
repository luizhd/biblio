package br.fib.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.fib.model.Emprestimo;

public class EmprestimoDAO {

	// a conexão com o banco de dados
	private Connection connection;

	public EmprestimoDAO() {
		this.connection = ConnectBD.getConnection();
	}

	public void inclui(Emprestimo emprestimo) {
		String sql = "insert into emprestimo (emp_estudante,emp_livro,emp_data,emp_entrega) values (?,?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, emprestimo.getEmp_Estudante());
			stmt.setString(2, emprestimo.getEmp_Livro());
			stmt.setString(3, emprestimo.getEmp_Data());
			stmt.setString(4, emprestimo.getEmp_Entrega());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualiza(Emprestimo emprestimo) {
		String sql = "update emprestimo set emp_estudante = ?, emp_livro = ?, emp_data = ?, emp_entrega = ? where id_emprestimo = ?";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, emprestimo.getEmp_Estudante());
			stmt.setString(2, emprestimo.getEmp_Livro());
			stmt.setString(3, emprestimo.getEmp_Data());
			stmt.setString(4, emprestimo.getEmp_Entrega());
			stmt.setInt(5, emprestimo.getId_Emprestimo());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void apaga(Emprestimo emprestimo) {
		String sql = "delete from emprestimo where id_emprestimo = ?";
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, emprestimo.getId_Emprestimo());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Emprestimo> listaEmprestimos() {

		ArrayList<Emprestimo> lista = new ArrayList<Emprestimo>();

		String sql = "select * from emprestimo order by nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Emprestimo emprestimo = new Emprestimo();
				emprestimo.setId_Emprestimo(rs.getInt("id_emprestimo"));
				emprestimo.setEmp_Estudante(rs.getString("emp_estudante"));
				emprestimo.setEmp_Livro(rs.getString("emp_livro"));
				emprestimo.setEmp_Data(rs.getString("emp_data"));
				emprestimo.setEmp_Entrega(rs.getString("emp_entrega"));
				lista.add(emprestimo);
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

	public Emprestimo pegaEmprestimo(Long id) {
		Emprestimo emprestimo = null;
		String sql = "select * from emprestimo where id_emprestimo = ? order by emp_estudante";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				emprestimo = new Emprestimo();
				emprestimo.setId_Emprestimo(rs.getInt("id_emprestimo"));
				emprestimo.setEmp_Estudante(rs.getString("emp_estudante"));
				emprestimo.setEmp_Livro(rs.getString("emp_livro"));
				emprestimo.setEmp_Data(rs.getString("emp_data"));
				emprestimo.setEmp_Entrega(rs.getString("emp_entrega"));
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return emprestimo;

	}

	public ArrayList<Emprestimo> listaemprestimosPorNome(String nome) {

		ArrayList<Emprestimo> lista = new ArrayList<Emprestimo>();

		String sql = "select * from emprestimo where upper(emp_estudante) like upper(?) order by emp_estudante";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, "%" + nome + "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Emprestimo emprestimo = new Emprestimo();
				emprestimo.setId_Emprestimo(rs.getInt("id_emprestimo"));
				emprestimo.setEmp_Estudante(rs.getString("emp_estudante"));
				emprestimo.setEmp_Livro(rs.getString("emp_livro"));
				emprestimo.setEmp_Data(rs.getString("emp_data"));
				emprestimo.setEmp_Entrega(rs.getString("emp_entrega"));
				;
				lista.add(emprestimo);
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
