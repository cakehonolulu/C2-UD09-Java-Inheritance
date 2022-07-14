package Task2;

public class Task2App {

	public static void main(String[] args) {
		Serie series[] = { new Serie("harry potter", 2, "comedia", "pepito"), 
				new Serie("love", 4, "drama", "juanito"),
				new Serie("risas y mas risas", 5, "drama", "antonieta"),
				new Serie("con faldas y a lo loco", 6, "historia", "cleopatra"),
				new Serie("animales en la selva", 2, "documental", "fito") };

		
		Videojuego[] videojuegos = new Videojuego[5];
		
		videojuegos[0] = new Videojuego("Resident Evil: Dead Aim", 67);
		videojuegos[1] = new Videojuego("Animal Crossing", 123, "Sandbox", "Nintendo");
		videojuegos[2] = new Videojuego("Project Zomboid", 20);
		videojuegos[3] = new Videojuego("Monster Hunter", 12);
		videojuegos[4] = new Videojuego("inFamous", 50, "Sandbox", "Sucker Punch");

		
		series[0].entregar();
		series[3].entregar();
		videojuegos[1].entregar();
		videojuegos[4].entregar();
		
		
	}

}
