package br.fib.model;

public class Estudante {

	private Integer Id_estudante;
	private String estu_nome;
	private String estu_Curso;

	public Integer getId_estu() {
		return Id_estudante;
	}

	public void setId_estu(Integer Id_estudante) {
		this.Id_estudante = Id_estudante;
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
