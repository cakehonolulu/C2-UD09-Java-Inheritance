package Task5;

public class Profesor extends Persona {

	private Materia materia;

	public Profesor() {
		super();
		this.materia = Materia.sin_materia;
	}

	public Profesor(Materia materia) {
		super();
		this.materia = materia;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return super.toString() + "Profesor [materia=" + materia + "]";
	}

}
