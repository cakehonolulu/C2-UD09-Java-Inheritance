package Task5;

public class Profesor extends Persona {

	String materia;

	public Profesor() {
		super();
		this.materia = "";
	}
	
	public Profesor(String materia) {
		super();
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
}
