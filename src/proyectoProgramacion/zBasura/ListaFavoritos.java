package proyectoProgramacion.zBasura;

import java.util.LinkedList;
import java.util.List;

import proyectoProgramacion.entidades.Pelicula;

public class ListaFavoritos {

	private int idelist;
	private int ideusu;
	private int numeroPelis; // Se puede extrear del size de la list
	private List<Pelicula> listaPeliculas;

	public ListaFavoritos(int idelist, int ideusu, int numeroPelis) {
		this.idelist = idelist;
		this.ideusu = ideusu;
		this.numeroPelis = 0;
		this.listaPeliculas = new LinkedList<Pelicula>();
	}

	public int getIdelist() {
		return idelist;
	}

	public void setIdelist(int idelist) {
		this.idelist = idelist;
	}

	public int getIdeusu() {
		return ideusu;
	}

	public void setIdeusu(int ideusu) {
		this.ideusu = ideusu;
	}

	public int getNumeroPelis() {
		return numeroPelis;
	}

	public void setNumeroPelis(int numeroPelis) {
		this.numeroPelis = numeroPelis;
	}

	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

}
