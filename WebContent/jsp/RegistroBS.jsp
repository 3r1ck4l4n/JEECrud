<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
    
  <%@ page import= "mx.ipn.upiicsa.web.practica1.disco.albumBean.Albums"
    import ="mx.ipn.upiicsa.web.practica1.disco.albumDB.DiscoDB"
    import= "java.io.PrintWriter"%>
    
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
<title>Registros</title>
</head>
<body>
		<% 		String clave = (String) request.getParameter("clave");
				String albun = (String) request.getParameter("album");
				String artista = (String) request.getParameter("artista");
				String fecha = (String) request.getParameter ("fecha");
				String caratula = (String) request.getParameter ("caratula");
				Albums album = new Albums();
				DiscoDB discoDB = new DiscoDB();
				album.setClave(clave);
				album.setAlbum(albun);
				album.setArtista(artista);
				album.setFecha(fecha);
				album.setCaratula(caratula);
				boolean y = discoDB.registroDisco(album); %>
		<%if(y==true) { 
			PrintWriter ou = response.getWriter();
			ou.print("<div class='alert alert-success bodystyle text-center' role='alert'> El Registro se realizo correctamente! </div>");
			}
			
			else{
				PrintWriter ou = response.getWriter();
				ou.print("<div class='alert alert-danger bodystyle text-center' role='alert'> El Registro no se realizo correctamente! </div>");
			
			}%>
		
			
		<div class="container mt-5 ">
  		<div class="row marginTop mt-5">
    		<div class="col-sm">
    			<div class="card text-dark bg-light mb-3 text-center" style="max-width: 18rem;" >
  					<img src="/Practica2/img/registro.png" class="card-img-top"  alt="...">
  					<div class="card-body bodystyle">
    					<h5 class="card-title">Insertar Nuevo Registro</h5>
    					<p class="card-text">Volver al formulario</p>
  				  		<a href="/Practica2/jsp/Register.jsp" class="btn btn-dark">Volver</a>
  					</div>	
    			</div>
    		</div>
    		<div class="col-sm">	
    			<div class="card text-dark bg-light mb-3 text-center" style="max-width: 18rem;" >
  					<img src="/Practica2/img/home.jpeg " class="card-img-top"  alt="...">
  					<div class="card-body bodystyle">
    					<h5 class="card-title">Menú Principal</h5>
    					<p class="card-text">Regresa al inicio.</p>
  				  		<a href="/Practica2/jsp/index.jsp" class="btn btn-dark">Inicio</a>
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
</html>