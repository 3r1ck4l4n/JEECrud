<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
  	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link rel='stylesheet' href='/Practica2/css/styleVista.css'>
	<link rel="stylesheet" href="/Practica2/css/styleMP.css">
	<link href="https://fonts.googleapis.com/css2?family=Kaushan+Script&family=Open+Sans&display=swap" rel="stylesheet">  
<title>Search</title>
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
<div class='container mt-5'>
	<form action='../Busqueda' method='post'>
  <div class="row">
    <div class="col">
      <input type="text" name='album' id='album' class="form-control" placeholder="Nombre del Album a buscar">
    </div>
    <div class="col">
     <button type="submit" class="btn btn-dark bodystyle"> Buscar</button>
   						
    </div>
  </div>
</form>
</div>

</body>
</html>