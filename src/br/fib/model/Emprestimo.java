package br.fib.model;

import java.util.Date;

public class Emprestimo {
	
	private Integer Id_Emprestimo;
	private String Emp_Estudante;
	private String Emp_Livro;
	private Date Emp_Data;
	private Date Emp_Entrega;
	
	
	public Integer getId_Emprestimo() {
		return this.Id_Emprestimo;
	}
	public void setId_Emprestimo(Integer id_Emprestimo) {
		this.Id_Emprestimo = id_Emprestimo;
	}
	public String getEmp_Estudante() {
		return this.Emp_Estudante;
	}
	public void setEmp_Estudante(String emp_Estudante) {
		this.Emp_Estudante = emp_Estudante;
	}
	public String getEmp_Livro() {
		return this.Emp_Livro;
	}
	public void setEmp_Livro(String emp_Livro) {
		this.Emp_Livro = emp_Livro;
	}
	public Date getEmp_Data() {
		return this.Emp_Data;
	}
	public void setEmp_Data(Date emp_Data) {
		this.Emp_Data = emp_Data;
	}
	public Date getEmp_Entrega() {
		return this.Emp_Entrega;
	}
	public void setEmp_Entrega(Date emp_Entrega) {
		this.Emp_Entrega = emp_Entrega;
	}
 
}
