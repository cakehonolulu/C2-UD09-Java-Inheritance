package Task3;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numPag;

	public Libro() {
		this.isbn = "";
		this.titulo = "";
		this.autor = "";
		this.numPag = 0;
	}

	public Libro(String isbn, String titulo, String autor, int numPag) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + isbn + " creado por " + autor + " tiene " + numPag + " páginas.";
	}

}
