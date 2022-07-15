package Task6;

public class Pelicula {
	/***
	 * declaración de atributos
	 */
	private String titulo;
	private double duracion;
	private int edadMimina;
	private String director;

	/***
	 * constructor por defecto
	 */
	public Pelicula() {
		this.titulo = "";
		this.duracion = 0;
		this.edadMimina = 0;
		this.director = "";
	}

	/***
	 * constructor con todos los atributos
	 * 
	 * @param titulo     de la película
	 * @param duracion   de la película
	 * @param edadMimina de la película
	 * @param director   de la película
	 */
	public Pelicula(String titulo, double duracion, int edadMimina, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMimina = edadMimina;
		this.director = director;
	}

	/***
	 * getters y setters de todos los atributos
	 * 
	 */
	public String getTitulo() {
		return titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public int getEdadMimina() {
		return edadMimina;
	}

	public String getDirector() {
		return director;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public void setEdadMimina(int edadMimina) {
		this.edadMimina = edadMimina;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	/***
	 * imprime los valores de todos los atributos de un objeto Pelicula
	 */
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", edadMimina=" + edadMimina + ", director="
				+ director + "]";
	}

}
