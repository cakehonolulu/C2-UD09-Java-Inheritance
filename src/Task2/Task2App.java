package Task2;

public class Task2App {

	public static void main(String[] args) {
		
		Videojuego[] videojuegos = new Videojuego[5];
		
		videojuegos[0] = new Videojuego("Resident Evil: Dead Aim", 67);
		videojuegos[1] = new Videojuego("Animal Crossing", 123, "Sandbox", "Nintendo");
		videojuegos[2] = new Videojuego("Project Zomboid", 20);
		videojuegos[3] = new Videojuego("Monster Hunter", 12);
		videojuegos[4] = new Videojuego("inFamous", 50, "Sandbox", "Sucker Punch");
	}

}
