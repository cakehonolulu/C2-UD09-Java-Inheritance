package Task4;

public class Task4App {

	public static void main(String[] args) {
		Raices equacion = new Raices(5, -20, 15);

		if (equacion.tieneRaices()) {
			equacion.obtenerRaices();
		}
		else if (equacion.tieneRaiz()) {
			equacion.obtenerRaiz();
		}
		
		equacion.calcular();
	}

}
