package Task5;

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
	public String toString() {
		return super.toString() + "Alumno [calificación=" + calificación + "]";
	}

}
