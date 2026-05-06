package proyectoProgramacion.da;

import java.util.ArrayList;

import proyectoProgramacion.entidades.Actor;

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

}
