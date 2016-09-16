$( "#a-cadastrar" ).click(function() { // botão, link, etc
  $( "#cadastrar_livro" ).show(0, function() { // ação
    $( "#deletar_livro" ).hide(); // esconder form aberto anteriormente
    $( "#listar_livro" ).hide();
    $( "#retirar_livro" ).hide();
  });
});


$( "#a-retirar" ).click(function() { // botão, link, etc
  $( "#retirar_livro" ).show(0, function() { // ação
    $( "#cadastrar_livro" ).hide(); // esconder form aberto anteriormente
    $( "#deletar_livro" ).hide(); // esconder form aberto anteriormente
    $( "#listar_livro" ).hide(); // esconder form aberto anteriormente
  });
});

$( "#a-deletar" ).click(function() { // botão, link, etc
  $( "#deletar_livro" ).show(0, function() { // ação
    $( "#cadastrar_livro" ).hide(); // esconder form aberto anteriormente
    $( "#retirar_livro" ).hide(); // esconder form aberto anteriormente
    $( "#listar_livro" ).hide(); // esconder form aberto anteriormente
  });
});

$( "#a-lista" ).click(function() { // botão, link, etc
  $( "#listar_livro" ).show(0, function() { // ação
    $( "#cadastrar_livro" ).hide(); // esconder form aberto anteriormente
    $( "#deletar_livro" ).hide(); // esconder form aberto anteriormente
    $( "#retirar_livro" ).hide(); // esconder form aberto anteriormente
  });
});

$(document).ready(function () 
{
  var trigger = $('.hamburger'), // aqui ta defidindo que o"trigger" (variavel) é a classe $('...classe...') .hamburger e tbm ta defiino que
     isClosed = false;           // a variavel isclosed é false (cntem o valor false ehuhe)

    trigger.click(function () // ae, ele diz que, quando a variavel trigger for clicada trigger.click(function), ele faz a função de mover o 
    {
      hamburger_cross();      
    });

    function hamburger_cross() 
    {

      if (isClosed == true) { // botao =! X         

      	$('#mySidenav').removeClass('menu-aberto');
		$('#main').removeClass('main-aberto');
        trigger.removeClass('is-open');
        trigger.addClass('is-closed');
        isClosed = false;
      } else {  // botao = X 
  		$('#mySidenav').addClass('menu-aberto');	
  		$('#main').addClass('main-aberto');
        trigger.removeClass('is-closed');
        trigger.addClass('is-open');
        isClosed = true;
      }
  }
});