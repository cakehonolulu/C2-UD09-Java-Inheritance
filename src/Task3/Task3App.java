package Task3;

public class Task3App {

	public static void main(String[] args) {

		Libro libro1 = new Libro("asd123-qwe432", "Cien años de soledad", "Gabriel Garcial Marquez", 606);
		Libro libro2 = new Libro("zxc987-mnb123", "El principe pirata", "Gaelen Foley", 397);

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		if (libro1.getNumPag() > libro2.getNumPag()) {
			System.out.println(libro1.getTitulo() + " tiene más páginas.");
		} else if (libro1.getNumPag() < libro2.getNumPag()) {
			System.out.println(libro2.getTitulo() + " tiene más páginas.");

		} else {
			System.out.println("Los dos libros tienen el mismo nuemero de páginas.");
		}
	}

}
