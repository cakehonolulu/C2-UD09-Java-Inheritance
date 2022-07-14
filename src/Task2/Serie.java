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

	@Override
	public boolean entregar(boolean atrb) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean devolver(boolean atrb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEntregado(boolean atrb) {
		// TODO Auto-generated method stub
		return atrb;
	}

	@Override
	public void compareTo(Object a) {
		// TODO Auto-generated method stub
			if (this.numTemporadas < ((Serie) a).getNumTemporadas()) {
				System.out.println("La serie "+ ((Serie) a).getTitulo() + "tiene mas temporadas que " + titulo);
			} else if (this.numTemporadas > ((Serie) a).getNumTemporadas()) {
				System.out.println("La serie "+ titulo + "tiene mas temporadas que " + ((Serie) a).getTitulo());
			}else {
				System.out.println("Las series " + titulo + " y " +  ((Serie) a).getTitulo() + "tienen el mismo numero de temporadas");
			}
	}

}
