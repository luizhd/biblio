<<<<<<< HEAD
<%@page import="br.fib.controller.LivroDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.fib.model.Livro"%>

<%@page import="br.fib.controller.AutorDAO"%>
<%@page import="br.fib.model.Autor"%>

<%@page import="br.fib.controller.EmprestimoDAO"%>
<%@page import="br.fib.model.Emprestimo"%>

<%@page import="br.fib.controller.EstudanteDAO"%>
<%@page import="br.fib.model.Estudante"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=devicewidth,initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FIB Library</title>
<link rel="stylesheet" href="icons/material.css">
<link rel="stylesheet" href="css/materialize.min.css">
<link rel="stylesheet" href="css/estilos.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href=" https://daneden.github.io/animate.css/animate.min.css">
</head>

<body>
<div id="topo-fixo" class="topo-fixo z-depth-1">
				<div class="valign-wrapper yellow darken-4 yellow-text">
					<button type="button" class="hamburger is-closed animated fadeInLeft" data-toggle="offcanvas">
            			<span class="hamb-top"></span>
            			<span class="hamb-middle"></span>
            			<span class="hamb-bottom"></span>
          			</button>
						<h5 class="titulo white-text center">FIB Library</h5>
				</div>


			<div id="mySidenav" class="sidenav">
	  			<a id="a-cadastrar" href="#">Cadastrar Livros</a>
	  			<a id="a-retirar" href="#">Retirar Livros</a>
	  			<a id="a-deletar" href="#">Deletar Livros</a>
	  			<a id="a-listar" href="#">Lista de Livros</a>
			</div>

			<div id="main">
	  			<div id="cadastrar_livro" style="display:none">
	  				<div class="row">
    					<form class="col s5">
      						<div class="row">
        						<div class="input-field col s12">
          							<input id="nome_livro" type="text" class="validate">
          								<label for="nome_livro">Nome do Livro</label>
          							</input>
        						</div>
        					</div>
        					<div class="row">
        						<div class="input-field col s6">
        							<input id="autor_livro" type="text" class="validate">
          								<label for="autor_livro">Autor</label>
          							</input>
        						</div>
        						<div class="input-field col s6">
        							<input id="editora_livro" type="text" class="validate">
          								<label for="editora_livro">Editora</label>
          							</input>
        						</div>
        						<div class="input-field col s6">
        							<input id="quantidade_livro" type="text" class="validate">
          								<label for="quantidade_livro">Quantidade</label>
          							</input>
        						</div>
        					</div>
        					<button class="btn waves-effect waves-light" type="submit" name="action">Cadastrar</button>
        					<button class="btn waves-effect waves-light" type="submit" name="action">Limpar Formulário</button>
        				</form>
        			</div>
        		</div>
	  			<div id="retirar_livro" style="display:none">
	  				<div class="row">
    					<form class="col s5">
      						<div class="row">
        						<div class="input-field col s12">
          							<input id="nome_livro" type="text" class="validate">
          								<label for="nome_livro">Nome do Livro</label>
          							</input>
        						</div>
        					</div>
        					<div class="row">
        						<div class="input-field col s12">
        							<input id="quantidaderetirada_livro" type="text" class="validate">
          								<label for="quantidaderetirada_livro">Quantidade</label>
          							</input>
        						</div>
        						<div class="input-field col s6">
        							<input id="datadevolucao_livro" type="text" class="validate">
          								<label for="datadevolucao_livro">Data de Devolução</label>
          							</input>
        						</div>
        					</div>
        				</form>
        			</div>
	  			</div>
				<div id="deletar_livro" style="display:none">
					<div class="row">
    					<form class="col s5">
      						<div class="row">
        						<div class="input-field col s12">
          							<input id="nome_livro" type="text" class="validate">
          								<label for="nome_livro">Nome do Livro</label>
          							</input>
        						</div>
        					</div>
        					<div class="row">
        						<div class="input-field col s12">
        							<input id="quantidadedeletar_livro" type="text" class="validate">
          								<label for="quantidadedeletar_livro">Quantidade para deletar</label>
          							</input>
        						</div>
        					</div>
        				</form>
        			</div>
				</div>
				<div id="listar_livro"></div>
			</div>
		</div>	
    		 <script src="js/jquery.min.js"></script>
			 <script src="js/materialize.min.js"></script>
			 <script src="js/app.js"></script>
</body>
</html>