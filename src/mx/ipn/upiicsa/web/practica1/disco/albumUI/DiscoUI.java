package mx.ipn.upiicsa.web.practica1.disco.albumUI;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class album
 */
@WebServlet("/album")
public class DiscoUI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiscoUI() {
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
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Registro de discos</h1>");
		out.print("<form action='RegistroDisco' method='get'>");
		out.print("<p>Clave del Disco");
		out.print("<input type='text' name='clave' id='clave'></p>");
		out.print("<p>Album");
		out.print("<input type='text' name='album' id='album'></p>");
		out.print("<p>Artista");
		out.print("<input type='text' name='artista' id='artista'></p>");
		out.print("<p>Fecha de lanzamiento");
		out.print("<input type='text' name='fecha' id='fecha'></p>");
		out.print("<p>URL de la caratula");
		out.print("<input type='text' name='caratula' id='caratula'></p>");
		out.print("<p><input type='submit' value='Registrar' name='autor'></p>");
		out.print("<a href='ConsultaGeneral'> Consulta</a> <br>");
		out.print("<h1>Editar registros</h1>");
		out.print("<h3>Inserte el Folio del articulo a editar</h3>");
		out.print("</form>");
		out.print("<form action='Actualizacion' method='get'>");
		out.print("<p>Clave del Disco");
		out.print("<input type='text' name='clave' id='clave'></p>");
		out.print("<p>Album");
		out.print("<input type='text' name='album' id='album'></p>");
		out.print("<p>Artista");
		out.print("<input type='text' name='artista' id='artista'></p>");
		out.print("<p>Fecha de lanzamiento");
		out.print("<input type='text' name='fecha' id='fecha'></p>");
		out.print("<p>URL de la caratula");
		out.print("<input type='text' name='caratula' id='caratula'></p>");
		out.print("<p><input type='submit' value='Editar' name='autor'></p>");
		out.print("</form>");
		out.print("</head>");
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
