package br.fib.model;

public class Estudante {
	
	private Integer Id_estu; 
	private String estu_nome;
	private String estu_Curso;
	
	public Integer getId_estu() {
		return Id_estu;
	}
	public void setId_estu(Integer id_estu) {
		Id_estu = id_estu;
	}
	
	public String getEstu_nome() {
		return estu_nome;
	}
	public void setEstu_nome(String estu_nome) {
		this.estu_nome = estu_nome;
	}
	
	public String getEstu_Curso() {
		return estu_Curso;
	}
	public void setEstu_Curso(String estu_Curso) {
		this.estu_Curso = estu_Curso;
	}

	

}
