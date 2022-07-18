package Task6;

import java.util.Random;

public class Cine {

	private Pelicula pelicula;
	private double precio;
	boolean asientos[] = new boolean[3 * 3];
	private Integer ocupacion;
	
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
	public Integer getOcupacion() {
		return ocupacion;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setOcupacion(Integer ocupacion) {
		this.ocupacion = ocupacion;
	}

	public void añadeEspectador(Espectador espectadores, Cine cine) {
		Random numeroAleatorio = new Random();
		Integer numero;
		boolean m_cond = true;
		
		if (this.getOcupacion() < cine.asientos.length)
		{
			if (espectadores.getEdad() >= this.getPelicula().getEdadMimina())
			{
				if (espectadores.getDinero() >= this.getPrecio())
				{
					do {
						numero = numeroAleatorio.nextInt(9);
						
						if (cine.asientos[numero] != true)
						{
							m_cond = false;
						}
					} while (m_cond);
					
					cine.asientos[numero] = true;
					
					this.setOcupacion((this.getOcupacion() + 1));
				}
				else
				{
					System.out.println(espectadores.getNombre()  + " no puede pagar la entrada, tiene " + 
							espectadores.getDinero() + "€ pero la entrada value " + this.getPrecio() + "€");
				}
			}
			else
			{
				System.out.println(espectadores.getNombre() + " no supera la edad mínima de " + this.getPelicula().getEdadMimina()
						+ "; tiene " + espectadores.getEdad() + " años.");
			}
		}
		else
		{
			System.out.println("El cine está lleno, no se puede añadir otro espectador.");
		}
	}
	
	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precio=" + precio + "]";
	}
	
	
	
}
