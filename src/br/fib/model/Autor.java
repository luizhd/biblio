package br.fib.model;

public class Autor {
	
	private Integer Id_Autor;
	private String Estu_Nome;
	private String Estu_Curso;
	
	
	public Integer getId_Autor() {
		return this.Id_Autor;
	}
	public void setId_Autor(Integer id_Autor) {
		this.Id_Autor = id_Autor;
	}
	public String getEstu_Nome() {
		return this.Estu_Nome;
	}
	public void setEstu_Nome(String estu_Nome) {
		this.Estu_Nome = estu_Nome;
	}
	public String getEstu_Curso() {
		return this.Estu_Curso;
	}
	public void setEstu_Curso(String estu_Curso) {
		this.Estu_Curso = estu_Curso;
	}

}
