<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import=" mx.ipn.upiicsa.web.practica1.disco.albumBean.Albums"
import= "mx.ipn.upiicsa.web.practica1.disco.albumDB.DiscoDB"
import ="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link rel='stylesheet' href='/Practica2/css/styleVista.css'>
	<link rel="stylesheet" href="/Practica2/css/styleMP.css">
<title>Modificar Album</title>
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
	
	<% List<Albums> listaDiscos;
		DiscoDB discoDB = new DiscoDB(); 
		listaDiscos = discoDB.consultaDiscos();
	%>	
		<table class='table table-striped table-dark text-center'>
				  <thead>
	 		   		<tr>
	      				<th scope='col'>ID</th>
	      				<th scope='col'>Album</th>
	      				<th scope='col'>Artista o Banda</th>
	      				<th scope='col'>Fecha de lanzamiento</th>
	      				<th scope='col'>Visual</th>
	      				<th scope='col'>Opciones</th>
	      			</tr>
	      		  <thead>
				  <tbody>
				  
				  
		<% for(Albums disco : listaDiscos) {%>
			<tr><th class='align-middle' scope='row'> <%out.print(disco.getClave());%> </th><td class='align-middle'> <%out.print(disco.getAlbum()); %> </td><td class='align-middle'> <% out.print(disco.getArtista());%> </td><td class='align-middle'> <%out.print(disco.getFecha());%> </td><td class='align-middle'> <img class='visual' src ="<%out.print(disco.getCaratula());%>"></td>
			<td class='align-middle'><a href="/Practica2/Actualizacion?clave=<%=disco.getClave()%>"> <img  alt="editar" class='opcion' src ="#"></a> <a href="/Practica2/EliminarDisco?clave=<%=disco.getClave()%>"> <img  alt="Delete" class='opcion' src ="#"></a>  </td> </tr> 
		<% }%>
	
		 </tbody>
		 </table>
		 
		 
		 
		 
	
      
		 <script src='https://code.jquery.com/jquery-3.5.1.slim.min.js' integrity='sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj' crossorigin='anonymous'></script>
		 <script src='https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js' integrity='sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo' crossorigin='anonymous'></script>
		 <script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js' integrity='sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI' crossorigin='anonymous'></script>
			
</body>
</html>