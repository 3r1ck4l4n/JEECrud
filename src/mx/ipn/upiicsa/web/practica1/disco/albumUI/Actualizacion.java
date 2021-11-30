package mx.ipn.upiicsa.web.practica1.disco.albumUI;

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
 * Servlet implementation class Actualizacion
 */
@WebServlet("/Actualizacion")
public class Actualizacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Actualizacion() {
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
		out.print("<script src='https://code.jquery.com/jquery-3.5.1.slim.min.js' integrity='sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj' crossorigin='anonymous'></script>");
		out.print("</head>");
		out.print("<body>");
		
		String clave = (String) request.getParameter("clave");
		DiscoDB discoDB = new DiscoDB();
		Albums consulta = discoDB.consultaDisco(clave);
	
		out.print("<style>"+
				"DIV.table"+ 
				"{display:table;}"+
				"FORM.tr, DIV.tr"+
				"{display:table-row;}"+
				"SPAN.td"+
				"{display:table-cell;}</style>");
		
		
		out.print("<div class='table'> <form class='tr' method='post' action='/Practica2/Update'> ");  
		
		
		out.print("<span class='td'><input type='text' name='clave' id='clave' > </span>");
		out.print("<span class='td'><input type='text' name='album' id='album' > </span>");
		out.print("<span class='td'><input type='text' name='artista' id='artista' > </span>");
		out.print("<span class='td'><input type='text' name='fecha' id='fecha' > </span>");
		out.print("<span class='td'><input type='text' name='caratula' id='caratula' > </span>");
		out.print("<span><input type='submit' value='Registrar' name='autor'></span>");
		out.print("</span></form>"); 
			
		out.print("<script> $('#clave').val('"+consulta.getClave() +"');</script>");
		out.print("<script> $('#album').val('"+consulta.getAlbum() +"');</script>");
		out.print("<script> $('#artista').val('"+consulta.getArtista()+"');</script>");
		out.print("<script> $('#fecha').val('"+consulta.getFecha() +"');</script>");
		out.print("<script> $('#caratula').val('"+consulta.getCaratula() +"');</script>");
		
		
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
