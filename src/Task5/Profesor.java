package Task5;

import java.util.Random;

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
	public void setAsistencia() {
		Random rng = new Random();
		int porcentaje = rng.nextInt(100);
		
		if (porcentaje > 20)
		{
			this.asistencia = true;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "Profesor [materia=" + materia + "]";
	}

}
