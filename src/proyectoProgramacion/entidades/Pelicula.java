package proyectoProgramacion.entidades;

public class Pelicula {

	private int idepeli;
	private String nombrepeli;
	private String argumento;

	public Pelicula(int idepeli, String nombrepeli, String argumento) {
		this.idepeli = idepeli;
		this.nombrepeli = nombrepeli;
		this.argumento = argumento;
	}

	public int getIdepeli() {
		return idepeli;
	}

	public void setIdepeli(int idepeli) {
		this.idepeli = idepeli;
	}

	public String getNombrepeli() {
		return nombrepeli;
	}

	public void setNombrepeli(String nombrepeli) {
		this.nombrepeli = nombrepeli;
	}

	public String getArgumento() {
		return argumento;
	}

	public void setArgumento(String argumento) {
		this.argumento = argumento;
	}

}
