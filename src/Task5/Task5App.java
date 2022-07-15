package Task5;

public class Task5App {

	public static void main(String[] args) {
		Profesor profesores[] = { new Profesor("Pepito", 40, "hombre", Materia.matematicas),
				new Profesor("Ana", 35, "mujer", Materia.fisica),
				new Profesor("Nate", 28, "n/b", Materia.filosofia),
				new Profesor("Pepita", 47, "mujer", Materia.sin_materia),
				new Profesor("Jose", 35, "hombre", Materia.matematicas),
				new Profesor("Josepa", 40, "mujer", Materia.sin_materia) };
		
		Alumno alumnos[] = { new Alumno("Pepito1", 15, "hombre", 8),
				new Alumno("Ana1", 16, "mujer", 5),
				new Alumno("Nate1", 15, "n/b", 2),
				new Alumno("Pepita1", 15, "mujer", 6),
				new Alumno("Jose1", 16, "hombre", 7),
				new Alumno("Josepa1", 15, "mujer", 3) };
		
		Alumno alumnos_2[] = { new Alumno("Pepito2", 15, "hombre", 2),
				new Alumno("Ana2", 16, "mujer", 5),
				new Alumno("Nate2", 15, "n/b", 6),
				new Alumno("Pepita2", 15, "mujer", 6),
				new Alumno("Jose2", 16, "hombre", 5),
				new Alumno("Josepa2", 15, "mujer", 2) };
		
		Aula aula = new Aula(1, 6, Materia.filosofia, profesores[2] , alumnos);
		
		aula.sePuedeDarClase();
	}

}
