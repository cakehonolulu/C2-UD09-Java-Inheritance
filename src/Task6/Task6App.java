package Task6;

public class Task6App {

	public static void main(String[] args) {
		Cine cine = new Cine();
		
		Pelicula pelicula = new Pelicula("Anabelle", 90, 18, "pepis");
		
		Espectador[] espectadores = {
					new Espectador("Pepito", 20, 20),
					new Espectador("Pepita", 30, 10),
					new Espectador("Juanito", 18, 10),
					new Espectador("Juanita", 16, 30),
					new Espectador("Jaimito", 30, 40),
					new Espectador("Jaimita", 31, 30),
					new Espectador("Paul", 18, 10),
					new Espectador("Alice", 16, 30),
					new Espectador("John Doe", 30, 40),
					new Espectador("Jane Doe", 31, 30)
				};
				
		for (int i = 0; i < cine.asientos.length; i++) {
			cine.asientos[i] = false;
		}

		System.out.println("Espectadores: " + espectadores.length);
		
		cine.setOcupacion(0);
		cine.setPrecio(30);
		cine.setPelicula(pelicula);
		
		for (int i = 0; i < espectadores.length; i++) {
			cine.añadeEspectador(espectadores[i], cine);
		}
		
		System.out.println("Ocupación: " + cine.getOcupacion() + " Máximo: " + cine.asientos.length);
	}

}
