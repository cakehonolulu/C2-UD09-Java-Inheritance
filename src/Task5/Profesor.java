package Task5;

import java.util.Random;

public class Profesor extends Persona {

	private Materia materia;

	public Profesor() {
		super();
		this.materia = Materia.sin_materia;
		setAsistencia();
	}

	public Profesor(String nombre, int edad, String sexo, Materia materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
		setAsistencia();
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
