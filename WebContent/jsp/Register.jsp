<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page %>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link rel="stylesheet" href="/Practica2/css/styleReg.css">
	<link href="https://fonts.googleapis.com/css2?family=Kaushan+Script&family=Open+Sans&display=swap" rel="stylesheet">  

<meta charset="UTF-8">
<title>Registro de Albums</title>

</head>
<body>
	<div class="container mt-5 ">
    	<div class="row">
       	 	<div class="col-md-12">
            	<div class="well well-sm">
					<form class="form-horizontal " role="form" action='/Practica2/jsp/RegistroBS.jsp' method='post'>
 						<fieldset>
 							<legend class="text-center header mt-3 mb-5 fontsytle">Registro de Discos</legend>
						
							<div class="form-group bodystyle">
							
    							<label  for="Clave">Clave del Album</label>
    							<div class="col-md-8 ">
    							<input type='text' class="form-control"  name='clave' id='clave'  placeholder="Indique el ID del Album">
    							</div>
    						</div>
    
    						<div class="form-group bodystyle">
    							<label for="Album">Nombre del material Discografico</label>
    							<div class="col-md-8">
    							<input type='text' class="form-control"  name='album' id='album'  placeholder="Escriba el titulo del Album o EP">
   								</div>
   							</div>
   						
  							<div class="form-group bodystyle">
    							<label for="Autor">Artista o Banda</label>
    							<div class="col-md-8">
    							<input type='text' class="form-control"  name='artista' id='artista'  placeholder="Escriba el Artista, Musico o Banda que lanzo el album">
								</div>
    						</div>
    						<div class="form-group bodystyle">
    							<label for="Fecha">Fecha de lanzamiento</label>
    							<div class="col-md-8">
    							<input type='text' class="form-control"  name='fecha' id='fecha' placeholder="Fecha">
 								</div>	
  							</div>
  						
  							<div class="form-group bodystyle">
    							<label for="Caratula">Portada del disco</label>
    							<div class="col-md-8 ">
    							<input type='text' class="form-control color-primary" name='caratula' id='caratula' placeholder="Inserte URL de la imagen">
								</div>
  							</div>
  							<div class="col-md-12 text-center">
  								<button type="submit" class="btn btn-primary bodystyle"> Registrar</button>
   							</div>
                    </fieldset>
                </form>
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