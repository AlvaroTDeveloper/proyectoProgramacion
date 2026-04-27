package proyectoProgramacion.entidades;

public class Usuario {

	private int ideusu;
	private String correo;
	private String passusu;
	private String usuario;

	public Usuario(int ideusu, String correo, String passusu, String usuario) {
		this.ideusu = ideusu;
		this.correo = correo;
		this.passusu = passusu;
		this.usuario = usuario;
	}

	public int getIdeusu() {
		return ideusu;
	}

	public void setIdeusu(int ideusu) {
		this.ideusu = ideusu;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassusu() {
		return passusu;
	}

	public void setPassusu(String passusu) {
		this.passusu = passusu;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
