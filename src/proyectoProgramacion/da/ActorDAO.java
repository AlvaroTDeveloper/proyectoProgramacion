package proyectoProgramacion.da;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;


import proyectoProgramacion.entidades.Actor;
import proyectoProgramacion.entidades.Pelicula;

public class ActorDAO extends Conexion implements DAO<Actor,Integer>{ 
	
	/* No estoy muy seguro de que en DAO<Actor,Integer> esté bien. 
	 * Va a pasar lo mismo en la clase PeliculaDAO
	 * Más que nada porque entiendo que el Integer es el número de objetos actor. 
	 * 
	 * */

	
	@Override
	public boolean insert(Actor obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Actor obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Actor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actor getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	public ArrayList<Pelicula> listaPeliculasPorActor (String nombre) {
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		conectar();
		CallableStatement stmt;
		
		try {
			stmt = conexion.prepareCall("{call comprobador(?)}");
			stmt.setString(1, nombre);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		
		
		
		
		return listaPeliculas;
	}
	
	
	
	
	
	private boolean existeActor (String nombre) {
		boolean resultado = false;
		conectar();
		CallableStatement stmt;
		try {
			stmt = conexion.prepareCall("{ ? = call comprobador(?)}");
			stmt.registerOutParameter(1, Types.BOOLEAN);
			stmt.setString(2, nombre);
			
			stmt.execute();
			
			resultado = stmt.getBoolean(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			desconectar();
		}
	
		return resultado; 
	}
	
	
	
	
}
