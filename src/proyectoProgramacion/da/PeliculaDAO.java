package proyectoProgramacion.da;

import java.util.ArrayList;

import proyectoProgramacion.entidades.Pelicula;

public class PeliculaDAO extends Conexion implements DAO<Pelicula,Integer> {

	/*No estoy muy seguro de que en DAO<Actor,Integer> esté bien.
	 *  Va a pasar lo mismo en la clase ActorDAO
	 * Más que nada porque entiendo que el Integer es el número de objetos actor. 
	 * 
	 * */
	
	
	
	
	@Override
	public boolean insert(Pelicula obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Pelicula obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Pelicula> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pelicula getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
