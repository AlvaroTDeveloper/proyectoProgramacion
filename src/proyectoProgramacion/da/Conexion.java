package proyectoProgramacion.da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import proyectoProgramacion.entidades.Pelicula;
import proyectoProgramacion.zBasura.Usuario;

public abstract class Conexion {

	protected Connection conexion;
	private String dbConnection;
	private String dbUser;
	private String dbPassword;

	public Conexion() {
		dbConnection = "jdbc:mysql://127.34.7.12:3306/empresa"; /* ESTE LINK ES EL QUE HAY QUE CAMBIAR */
		dbUser = "root";
		dbPassword = "root";
	}

	protected void conectar() {
		try {
			this.conexion = DriverManager.getConnection(this.dbConnection, this.dbUser, this.dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void desconectar() {
		try {
			if (this.conexion != null && !this.conexion.isClosed()) {
				this.conexion.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
