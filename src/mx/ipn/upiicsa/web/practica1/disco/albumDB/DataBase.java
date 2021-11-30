package mx.ipn.upiicsa.web.practica1.disco.albumDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
	Connection connection;
	protected void connectDatabase() {
		 
        try {
            try { 
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            connection = null;
            connection = DriverManager.getConnection(
            		"jdbc:postgresql://localhost:5432/disco",
                    "pweb", "pweb");
            
            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
            
            
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    } 
	
	protected void desconectar() {
		try {
			connection.close();
		}catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
		
	}


}
