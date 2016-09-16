package br.fib.model;

public class Autor {

	private Long Id_Autor;
	private String Autor_Nome;
	private String Autor_Cidade;

	public Long getId_Autor() {
		return this.Id_Autor;
	}

	public void setId_Autor(Long Id_Autor) {
		this.Id_Autor = Id_Autor;
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
