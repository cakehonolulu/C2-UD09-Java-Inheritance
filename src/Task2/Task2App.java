package Task2;

public class Task2App {

	public static void main(String[] args) {


		Serie series[] = { new Serie("harry potter", 2, "comedia", "pepito"), 
		new Serie("love", 4, "drama", "juanito"),
		new Serie("risas y mas risas", 5, "drama", "antonieta"),
		new Serie("con faldas y a lo loco", 6, "historia", "cleopatra"),
		new Serie("animales en la selva", 2, "documental", "fito") };


		Videojuego[] videojuegos = { new Videojuego("Resident Evil: Dead Aim", 67),
				new Videojuego("Animal Crossing", 123, "Sandbox", "Nintendo"),
				new Videojuego("Project Zomboid", 20),
				new Videojuego("Monster Hunter", 12),
				new Videojuego("inFamous", 50, "Sandbox", "Sucker Punch")};

		series[0].entregar();
		series[3].entregar();
		videojuegos[1].entregar();
		videojuegos[4].entregar();
		
		int contVid=0;
		int contSer=0;
		
		
		Videojuego masLargo = null;
		
		for (int i = 0; i < videojuegos.length; i++) {
			if (videojuegos[i].isEntregado()) {
				//System.out.println(videojuegos[i].toString());
				contVid++;
			}
			
			if (masLargo == null) {
				masLargo=videojuegos[i];
			} else {
				if (!videojuegos[i].compareTo(masLargo)) {
					masLargo=videojuegos[i];
				}
				
			}	
		}
		
		System.out.println(masLargo.toString());
		
		Serie MasTemp=null;
		for (int i = 0; i < series.length; i++) {
			if (series[i].isEntregado()) {
				//System.out.println(series[i].toString());
				contSer++;
			}
			
			if (MasTemp == null) {
				MasTemp=series[i];
			} else {
				if (!series[i].compareTo(MasTemp)) {
					MasTemp=series[i];
				}
				
			}	
			
		}
		System.out.println(MasTemp.toString());
		int contTot=contVid+contSer;
		
		
		
	}

}
