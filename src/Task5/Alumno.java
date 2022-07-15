package Task5;

import java.util.Random;

public class Alumno extends Persona {
	private double calificación;

	public Alumno(double calificación) {
		super();
		this.calificación = calificación;
	}

	public Alumno() {
		super();
		this.calificación = 0;

	}

	public double getCalificación() {
		return calificación;
	}

	public void setCalificación(double calificación) {
		this.calificación = calificación;
	}

	@Override
	public void setAsistencia() {
		Random rng = new Random();
		int porcentaje = rng.nextInt(100);
		
		if (porcentaje > 50)
		{
			this.asistencia = true;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "Alumno [calificación=" + calificación + "]";
	}

}
