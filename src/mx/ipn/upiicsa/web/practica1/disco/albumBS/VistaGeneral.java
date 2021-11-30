package mx.ipn.upiicsa.web.practica1.disco.albumBS;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.ipn.upiicsa.web.practica1.disco.albumBean.Albums;
import mx.ipn.upiicsa.web.practica1.disco.albumDB.DiscoDB;


/**
 * Servlet implementation class ConsultaGeneral
 */
@WebServlet("/VistaGeneral")
public class VistaGeneral extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VistaGeneral() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE HTML>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<!-- Bootstrap CSS -->");
		out.print("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css' integrity='sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk' crossorigin='anonymous'>");
		out.print("<link rel='stylesheet' href='/Practica2/css/styleVista.css'>");
		out.print("<link rel='stylesheet' href='/Practica2/css/styleMP.css'>");
		out.print("<title>Listas</title>");
		out.print("</head>");
		out.print("<body>");
		
		out.print("<nav class='navbar navbar-expand-lg navbar-dark bg-dark'>"+
			"<a class='navbar-brand' href='/Practica2/jsp/index.jsp'><img  alt='editar' id='nav-img' class=''.img-thumbnail' src ='/Practica2/img/disco.png'></a>"+
			"<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarText' aria-controls='navbarText' aria-expanded='false' aria-label='Toggle navigation'>"+
			"<span class='navbar-toggler-icon'></span>"+
			"</button>"+
			"<div class='collapse navbar-collapse' id='navbarText'>"+
			"<ul class='navbar-nav mr-auto'>"+
  				"<li class='nav-item active'>"+
    				"<a class='nav-link' href='/Practica2/jsp/index.jsp'>Home <span class='sr-only'>(current)</span></a>"+
  				"</li>"+
  				"<li class='nav-item'>"+
    				"<a class='nav-link' href='/Practica2/jsp/Register.jsp'>Registra</a>"+
  				"</li>"+
  				"<li class='nav-item'>"+
    				"<a class='nav-link' href='/Practica2/VistaGeneral'>Lista de Albums</a>"+
  				"</li>"+
			"</ul>"+
				"<span class='navbar-text'>"+
  				"Busca, registra y comparte información de tus albums favoritos!"+
			"</span>"+
			"</div>"+
	"</nav>");
		
		List<Albums> listaDiscos;
		DiscoDB discoDB = new DiscoDB(); 
		listaDiscos = discoDB.consultaDiscos();
		
		out.print("<table class='table table-striped table-dark text-center mt-5'>"+
				  "<thead>"+
	 		   		"<tr>"+
	      				"<th scope='col'>ID</th>"+
	      				"<th scope='col'>Album</th>"+
	      				"<th scope='col'>Artista o Banda</th>"+
	      				"<th scope='col'>Fecha de lanzamiento</th>"+
	      				"<th scope='col'>Visual</th>"+
	      			"</tr>"+
	      		  "<thead>"+
				  "<tbody>");
		
		for(Albums disco : listaDiscos) {
			out.print("<tr><th class='align-middle' scope='row'> " + disco.getClave()+"</th><td class='align-middle'> " + disco.getAlbum()+"</td><td class='align-middle'>" +disco.getArtista()+"</td><td class='align-middle'>"+ disco.getFecha()+ "</td><td class='align-middle'>"+"<img class='visual' src ='"+disco.getCaratula()+"'>" +" </td></tr>" );
		}
		
	
	
		
		 out.print("<script src='https://code.jquery.com/jquery-3.5.1.slim.min.js' integrity='sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj' crossorigin='anonymous'></script>");
		 out.print ("<script src='https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js' integrity='sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo' crossorigin='anonymous'></script>");
		 out.print ( "<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js' integrity='sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI' crossorigin='anonymous'></script>");
			
		
		
		 out.print("</tbody>"+
		 "</table>");
		
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
