package mx.ipn.upiicsa.web.practica1.disco.albumBS;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import mx.ipn.upiicsa.web.practica1.disco.albumDB.DiscoDB;

/**
 * Servlet implementation class EliminarDisco
 */
@WebServlet("/EliminarDisco")
public class EliminarDisco extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarDisco() {
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
		out.print("<title>Eliminar</title>");
		out.print("</head>");
		out.print("<body>");
		
		String clave = (String) request.getParameter("clave");
		DiscoDB discoDB = new DiscoDB();
		int x = discoDB.borrarRegistro(clave);
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
		
		
		out.print("<div mt-5>");
		if(x!=0) { 
			PrintWriter ou = response.getWriter();
			ou.print("<div class='alert alert-success bodystyle text-center' role='alert'>El articulo fue eliminado de forma exitosa! </div>");
			}
			
			else{
				PrintWriter ou = response.getWriter();
				ou.print("<div class='alert alert-danger bodystyle text-center' role='alert'> La actualizacion no se realizo con exito! </div>");
			
			}
		out.print("</div>");
		
		
		
		
		
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
