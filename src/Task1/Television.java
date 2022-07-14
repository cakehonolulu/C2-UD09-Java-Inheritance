package Task1;

public class Television extends Electrodomestico {

	private double resolucion;
	private boolean sintonizador;

	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizador = false;
		precioFinal();
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.sintonizador = false;
		precioFinal();
	}

	public Television(double precioBase, String color, char consumoEnerg, double peso, double resolucion,
		boolean sintonizador) {
		super(precioBase, color, consumoEnerg, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
		precioFinal();
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

	public void precioFinal() {
		super.precioFinal();
		
		if (this.resolucion >= 40) {
			this.precioBase += (this.precioBase * 0.3);
		}
		
		if (this.sintonizador == true) {
			this.precioBase += 50;
		}
	}
	
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizador=" + sintonizador + "]";
	}

}
