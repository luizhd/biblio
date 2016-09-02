package br.fib.model;

public class Autor {
	
	private Integer Id_Autor;
	private String Autor_Nome;
	private String Autor_Cidade;
	
	
	public Integer getId_Autor() {
		return this.Id_Autor;
	}
	public void setId_Autor(Integer id_Autor) {
		this.Id_Autor = id_Autor;
	}
	public String getAutor_Nome() {
		return this.Autor_Nome;
	}
	public void setAutor_Nome(String Autor_Nome) {
		this.Autor_Nome = Autor_Nome;
	}
	public String getAutor_Cidade() {
		return this.Autor_Cidade;
	}
	public void setAutor_Cidade(String Autor_Cidade) {
		this.Autor_Cidade = Autor_Cidade;
	}

}
