package proyectoProgramacion.da;

import java.util.ArrayList;

public interface DAO<T,E> {
	
	public boolean insert (T obj); 
	public boolean update (T obj);
	public boolean deleteById (E id);
	public ArrayList<T> getAll();
	public T getById (E id);

}
