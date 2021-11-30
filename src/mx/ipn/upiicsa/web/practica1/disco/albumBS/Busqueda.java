package mx.ipn.upiicsa.web.practica1.disco.albumBS;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.ipn.upiicsa.web.practica1.disco.albumBean.Albums;
import mx.ipn.upiicsa.web.practica1.disco.albumDB.DiscoDB;



/**
 * Servlet implementation class Busqueda
 */
@WebServlet("/Busqueda")
public class Busqueda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Busqueda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE HTML>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<!-- Bootstrap CSS -->");
		out.print("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css' integrity='sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk' crossorigin='anonymous'>");
		out.print("<link rel='stylesheet' href='/Practica2/css/styleVista.css'>");
		out.print("<link rel='stylesheet' href='/Practica2/css/styleMP.css'>");
		out.print("<title>Buscar</title>");
		out.print("</head>");
		out.print("<body>");
		String nombre = (String) request.getParameter("album");
		
		DiscoDB discoDB = new DiscoDB();
		out.print("<nav class='navbar navbar-expand-lg navbar-dark bg-dark'>"+
				"<a class='navbar-brand' href='/Practica2/jsp/index.jsp'><img  alt='editar' id='nav-img' class=''.img-thumbnail' src ='/Practica2/img/disco.png'></a>"+
				"<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">"+
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
		
		Albums consulta = discoDB.consultaAlbum(nombre);
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
		
		out.print("<tr><th class='align-middle' scope='row'> " + consulta.getClave()+"</th><td class='align-middle'> " + consulta.getAlbum()+"</td><td class='align-middle'>" +consulta.getArtista()+"</td><td class='align-middle'>"+ consulta.getFecha()+ "</td><td class='align-middle'>"+"<img class='visual' src ='"+consulta.getCaratula()+"'>" +" </td></tr>" );
		
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
