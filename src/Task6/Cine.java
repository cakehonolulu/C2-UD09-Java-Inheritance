package Task6;

public class Cine {

	private Pelicula pelicula;
	private double precio;
	
	public Cine(Pelicula pelicula, double precio) {
		
		this.pelicula = pelicula;
		this.precio = precio;
	}
	public Cine() {
		this.pelicula = new Pelicula();
		this.precio = 0;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precio=" + precio + "]";
	}
	
	
	
}
