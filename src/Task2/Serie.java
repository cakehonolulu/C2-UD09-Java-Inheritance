package Task2;

public class Serie implements Entregable {
	protected String titulo;
	protected int numTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie() {
		this.titulo = "";
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}



	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	
	//Si el objeto que le pasamos por parametros tiene mas temporadas que el de la clase, devolvemos true
	@Override
	public boolean compareTo(Object a) {
		// TODO Auto-generated method stub

		boolean esMasLargo=false;
		if (this.numTemporadas < ((Serie) a).getNumTemporadas()) {
			esMasLargo=true;
	} 
		
		return esMasLargo;
	}

	@Override
	public boolean entregar() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean devolver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		
		return this.entregado;
	}

}
