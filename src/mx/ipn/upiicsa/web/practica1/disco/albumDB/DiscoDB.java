package mx.ipn.upiicsa.web.practica1.disco.albumDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mx.ipn.upiicsa.web.practica1.disco.albumBean.Albums;


public class DiscoDB extends DataBase{
	
	public List<Albums> consultaDiscos() {
		
		connectDatabase();	
		List<Albums> album=new ArrayList<Albums>();
		try {
			Statement stm= connection.createStatement();
			
			ResultSet rs=stm.executeQuery("select * from albums");
	
			while (rs.next()) {
				Albums disco=new Albums();
				disco.setClave(rs.getString("clave"));
				disco.setAlbum(rs.getString("album"));
				disco.setArtista(rs.getString("artista"));
				disco.setFecha(rs.getString("fecha"));
				disco.setCaratula(rs.getString("caratula"));
				album.add(disco);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			 
		}
		desconectar();
		return album;
	}
	
	public boolean registroDisco(Albums album) {
		connectDatabase();
		boolean x=false;
		try {
			String query = " insert into albums (clave, album, artista, fecha, caratula)" + " values (?, ?, ?, ?, ?)";

			PreparedStatement preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, album.getClave());
			preparedStmt.setString(2, album.getAlbum());
			preparedStmt.setString(3, album.getArtista());
			preparedStmt.setString(4, album.getFecha());
			preparedStmt.setString(5, album.getCaratula());

			preparedStmt.execute();
			preparedStmt.close();
			x= true;
			
		} catch (Exception e) {
		 
			e.printStackTrace();
			x=false;
		}
		desconectar();
		return x;
	}
	
	public int editarAlbum  (Albums album) {
		connectDatabase();
		int rs = 0;
		try {
		
		String query = "UPDATE albums SET album=?, artista=?, fecha=?, caratula= ? WHERE clave = ?";

		PreparedStatement preparedStmt = connection.prepareStatement(query);
		preparedStmt.setString(1, album.getAlbum());
		preparedStmt.setString(2, album.getArtista());
		preparedStmt.setString(3, album.getFecha());
		preparedStmt.setString(4, album.getCaratula());
		preparedStmt.setString(5, album.getClave());

		preparedStmt.execute();
		preparedStmt.close();
		
		rs=1;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public Albums consultaDisco(String clave) { 
		connectDatabase();
		Albums disco = new Albums();
		try {
		String query = "SELECT * from albums WHERE clave = ?";
		PreparedStatement preparedStmt = connection.prepareStatement(query);
		preparedStmt.setString(1, clave);
		ResultSet rs = preparedStmt.executeQuery();
		if (rs.next()) {
		
			disco.setClave(rs.getString("clave"));
			disco.setAlbum(rs.getString("album"));
			disco.setArtista(rs.getString("artista"));
			disco.setFecha(rs.getString("fecha"));
			disco.setCaratula(rs.getString("caratula"));
		}
		}
		catch (Exception e) {
			e.printStackTrace();

		}
		desconectar();
		return disco;
		
	}
	public Albums consultaAlbum(String album) { 
		connectDatabase();
		Albums disco = new Albums();
		try {
		String query = "SELECT * from albums WHERE album = ?";
		PreparedStatement preparedStmt = connection.prepareStatement(query);
		preparedStmt.setString(1, album);
		ResultSet rs = preparedStmt.executeQuery();
		if (rs.next()) {
		
			disco.setClave(rs.getString("clave"));
			disco.setAlbum(rs.getString("album"));
			disco.setArtista(rs.getString("artista"));
			disco.setFecha(rs.getString("fecha"));
			disco.setCaratula(rs.getString("caratula"));
		}
		}
		catch (Exception e) {
			e.printStackTrace();

		}
		desconectar();
		return disco;
		
	}
	
	public int borrarRegistro(String clave) {
		int x=0;
		connectDatabase();
		
		
		try {
			String query = "Delete from albums WHERE clave = ?";
			PreparedStatement preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, clave);
			x=preparedStmt.executeUpdate();
		}
		
		catch (Exception e) {
			e.printStackTrace();

		}
		
		
		return x;
	}
	
}
