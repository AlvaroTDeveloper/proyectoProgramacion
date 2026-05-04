package proyectoProgramacion.entidades;

public class Actor {

	private int ideActor;
	private String nomActor;
	private int edad;

	public Actor(int ideActor, String nomActor, int edad) {
		this.ideActor = ideActor;
		this.nomActor = nomActor;
		this.edad = edad;
	}

	public int getIdeActor() {
		return ideActor;
	}

	public String getNomActor() {
		return nomActor;
	}

	public void setNomActor(String nomActor) {
		this.nomActor = nomActor;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
