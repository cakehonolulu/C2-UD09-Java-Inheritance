package Task2;

public class Videojuego {
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String companyia;
	
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.companyia = "";
	}
	
	
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.companyia = "";
	}



	public Videojuego(String titulo, int horasEstimadas, String genero, String companyia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.companyia = companyia;
	}



	public String getTitulo() {
		return titulo;
	}



	public int getHorasEstimadas() {
		return horasEstimadas;
	}



	public String getGenero() {
		return genero;
	}



	public String getCompanyia() {
		return companyia;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public void setCompanyia(String companyia) {
		this.companyia = companyia;
	}



	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", companyia=" + companyia + "]";
	}
	
	
	
}
