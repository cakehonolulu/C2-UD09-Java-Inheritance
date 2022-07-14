package Task1;

public class Television extends Electrodomestico {

	private double resolucion;
	private boolean sintonizador;

	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizador = false;
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.sintonizador = false;
	}

	public Television(double precioBase, colores color, consumoEnergetico consumoEnerg, double peso, double resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumoEnerg, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;

	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizador=" + sintonizador + "]";
	}

}
