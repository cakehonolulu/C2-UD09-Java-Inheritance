package Task6;

public class Espectador {
	/***
	 * declaración de atributos de la clase Espectador
	 */
	private String nombre;
	private int edad;
	private double dinero;

	/***
	 * constructor por defecto
	 */
	public Espectador() {
		this.nombre = "";
		this.edad = 0;
		this.dinero = 0;
	}

	/***
	 * constructor con todos los atributos pasados por parametros
	 * 
	 * @param nombre del espectador
	 * @param edad   del espectador
	 * @param dinero del espectador
	 */
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	/***
	 * 
	 * getters y setters de todos los atributos de la clase Espectador
	 */
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	/***
	 * muestra los valores de todos los atributos de un objeto de la clase
	 * Espectador
	 */
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}

}
