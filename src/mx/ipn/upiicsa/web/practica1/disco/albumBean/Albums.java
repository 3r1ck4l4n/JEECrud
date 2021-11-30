package mx.ipn.upiicsa.web.practica1.disco.albumBean;

public class Albums {
	private String clave;
	private String album;
	private String artista;
	private String fecha;
	private String caratula;

	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCaratula() {
		return caratula;
	}
	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
}
