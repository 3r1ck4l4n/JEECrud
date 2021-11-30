<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

 <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link rel="stylesheet" href="/Practica2/css/styleMP.css">
	<link href="https://fonts.googleapis.com/css2?family=Kaushan+Script&family=Open+Sans&display=swap" rel="stylesheet">  
    <title>Music-Web</title>
  </head>
  
  <body>
  
  		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  			<a class="navbar-brand" href="/Practica2/jsp/index.jsp"><img  alt="editar" id="nav-img" class=".img-thumbnail" src ="/Practica2/img/disco.png"></a>
  			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    			<span class="navbar-toggler-icon"></span>
  			</button>
  			<div class="collapse navbar-collapse" id="navbarText">
    			<ul class="navbar-nav mr-auto">
      				<li class="nav-item active">
        				<a class="nav-link" href="/Practica2/jsp/index.jsp">Home <span class="sr-only">(current)</span></a>
      				</li>
      				<li class="nav-item">
        				<a class="nav-link" href="/Practica2/jsp/Register.jsp">Registra</a>
      				</li>
      				<li class="nav-item">
        				<a class="nav-link" href="/Practica2/VistaGeneral">Lista de Albums</a>
      				</li>
    			</ul>
   				<span class="navbar-text">
      				Busca, registra y comparte información de tus albums favoritos!
    			</span>
  			</div>
		</nav>
  

	
	<div class="container mt-5 ">
  		<div class="row marginTop mt-5">
    		<div class="col-md">
    			<div class="card text-dark bg-light mb-3" style="max-width: 18rem;" >
  					<img src="/Practica2/img/registro.png" class="card-img-top"  alt="...">
  					<div class="card-body bodystyle">
    					<h5 class="card-title">Insertar Registro</h5>
    					<p class="card-text">Inserta tus albums favoritos y su informacion.</p>
  				  		<a href="/Practica2/jsp/Register.jsp" class="btn btn-dark">Registar</a>
  					</div>	
    			</div>
    		</div>
    		<div class="col-md">	
    			<div class="card text-dark bg-light mb-3" style="max-width: 18rem;" >
  					<img src="/Practica2/img/busqueda.png" class="card-img-top"  alt="...">
  					<div class="card-body bodystyle">
    					<h5 class="card-title">Busqueda</h5>
    					<p class="card-text">Buscar informacion de tus albums favoritos.</p>
  				  		<a href="/Practica2/jsp/Search.jsp" class="btn btn-dark">Buscar</a>
  					</div>	
    			</div>
    		</div>
    		<div class="col-md ">
  	  			<div class="card text-dark bg-light mb-3" style="max-width: 18rem;" >
  					<img src="/Practica2/img/eliminar.jpg" class="card-img-top" alt="...">
  					<div class="card-body bodystyle">
    					<h5 class="card-title">Eliminar Registro</h5>
    					<p class="card-text">Elimina o edita Discos</p>
  				  		<a href="/Practica2/jsp/Modificar.jsp" class="btn btn-dark">Opciones</a>
  					</div>	
    			</div>
    		</div>
  		</div>
	</div>
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
  </body>
</body>
</html>