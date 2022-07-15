package Task5;

import java.util.Arrays;

public class Aula {
	int id;
	int maxEst;
	Materia materia;
	Alumno alumnos[];
	Profesor profesor;

	public Aula(int id, int maxEst, Materia materia, Profesor profesor, Alumno alumnos[]) {
		this.id = id;
		this.maxEst = maxEst;
		this.materia = materia;
		this.profesor = profesor;
		this.alumnos = alumnos;
	}

	public Aula() {
		this.id = 0;
		this.maxEst = 0;
		this.materia = Materia.sin_materia;
		this.profesor = null;
		this.alumnos = null;

	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public int getId() {
		return id;
	}

	public int getMaxEst() {
		return maxEst;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMaxEst(int maxEst) {
		this.maxEst = maxEst;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public boolean sePuedeDarClase(Aula aula) {

		return true;
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", maxEst=" + maxEst + ", materia=" + materia + ", alumnos="
				+ Arrays.toString(alumnos) + ", profesor=" + profesor + "]";
	}

}
