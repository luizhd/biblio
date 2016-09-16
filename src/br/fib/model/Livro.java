package br.fib.model;

public class Livro {

	private Integer Id_Livro;
	private String Livro_Nome;
	private String Livro_autor;
	private String Livro_publicacao;
	private String Livro_editora;
	private String Livro_sessao;

	public Integer getId_Livro() {
		return this.Id_Livro;
	}

	public void setId_Livro(Integer id_Livro) {
		this.Id_Livro = id_Livro;
	}

	public String getLivro_Nome() {
		return this.Livro_Nome;
	}

	public void setLivro_Nome(String livro_Nome) {
		this.Livro_Nome = livro_Nome;
	}

	public String getLivro_autor() {
		return this.Livro_autor;
	}

	public void setLivro_autor(String livro_autor) {
		this.Livro_autor = livro_autor;
	}

	public String getLivro_publicacao() {
		return this.Livro_publicacao;
	}

	public void setLivro_publicacao(String livro_publicacao) {
		this.Livro_publicacao = livro_publicacao;
	}

	public String getLivro_editora() {
		return this.Livro_editora;
	}

	public void setLivro_editora(String livro_editora) {
		this.Livro_editora = livro_editora;
	}

	public String getLivro_sessao() {
		return this.Livro_sessao;
	}

	public void setLivro_sessao(String livro_sessao) {
		this.Livro_sessao = livro_sessao;
	}

}
