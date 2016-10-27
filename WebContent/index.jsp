<%@page import="br.fib.controller.LivroDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.fib.model.Livro"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Livros Dao</h1>

<%  LivroDAO dao = new LivroDAO();
ArrayList<Livro> listaLivro = dao.listaLivro(); %>

	<table border="1">
			<tr>
				<td><b> Id_Livro</b></td>
				<td><b> Livro_Nome </b></td>
				<td><b> Livro_autor </b></td>
				<td><b> Livro_publicacao </b></td>
				<td><b> Livro_editora </b></td>
				<td><b> Livro_sessao </b></td>
			</tr>
		<% 

		for (Livro livro : listaLivro) { %>
			<tr>
				<td><b><% out.print(livro.getId_Livro()); %></b></td>
				<td><b><% out.print(livro.getLivro_Nome()); %> </b></td>
				<td><b><% out.print(livro.getLivro_autor()); %> </b></td>
				<td><b><% out.print(livro.getLivro_publicacao()); %> </b></td>
				<td><b> <% out.print(livro.getLivro_editora()); %> </b></td>
				<td><b> <% out.print(livro.getLivro_sessao()); %> </b></td>
			</tr>
			
		<%  } %>
	</table>

</body>
</html>