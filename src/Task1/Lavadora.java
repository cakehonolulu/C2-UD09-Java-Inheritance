package Task1;

public class Lavadora extends Electrodomestico {
	private int carga;

	private final int PESO_CARGA = 5;

	public Lavadora() {
		super();
		this.carga = PESO_CARGA;
		precioFinal();
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = PESO_CARGA;
		precioFinal();
	}

	public Lavadora(double precioBase, String color, char consumoEnerg, double peso, int carga) {
		super(precioBase, color, consumoEnerg, peso);
		this.carga = carga;
		precioFinal();
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void precioFinal() {
		super.precioFinal();
		
		if (carga >= 30) {
			this.precioBase += 50;
		}
	}
	
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}

}
