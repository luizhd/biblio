package br.fib.model;

public class Estudante {
	
	private Integer Id_Autor; 
	private String Autor_nome;
	private String Autor_cidade;
	
	
	public Integer getId_Autor() {
		return this.Id_Autor;
	}
	public void setId_Autor(Integer id_Autor) {
		this.Id_Autor = id_Autor;
	}
	public String getAutor_nome() {
		return this.Autor_nome;
	}
	public void setAutor_nome(String autor_nome) {
		this.Autor_nome = autor_nome;
	}
	public String getAutor_cidade() {
		return this.Autor_cidade;
	}
	public void setAutor_cidade(String autor_cidade) {
		this.Autor_cidade = autor_cidade;
	}

}
