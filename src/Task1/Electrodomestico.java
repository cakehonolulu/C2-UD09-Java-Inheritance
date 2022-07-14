package Task1;

public class Electrodomestico {
	public String colores[] = new String[] { "blanco", "negro", "rojo", "azul", "gris" };
	public char consumos[] = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };

	protected double precioBase;
	protected String color;
	protected char consumoEnerg;
	protected double peso;

	private final String COLOR = colores[0];
	private final char CONSUMO = consumos[1];
	private final double PRECIO_BASE = 100;
	private final double PESO = 5;

	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnerg = CONSUMO;
		this.peso = PESO;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumoEnerg = CONSUMO;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnerg, double peso) {
		consumoEnerg = Character.toUpperCase(consumoEnerg);
		consumoEnerg = comprobarConsumoEnergetico(consumoEnerg);
		color = color.toLowerCase();
		color = comprobarColor(color);
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnerg = consumoEnerg;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnerg() {
		return consumoEnerg;
	}

	public void setConsumoEnerg(char consumoEnerg) {
		this.consumoEnerg = consumoEnerg;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char comprobarConsumoEnergetico(char letra) {
		boolean m_valid = false;

		for (int i = 0; i < consumos.length; i++) {
			if (letra == consumos[i]) {
				m_valid = true;
			}
		}

		if (!m_valid) {
			letra = CONSUMO;
		}

		return letra;

	}

	public String comprobarColor(String color) {
		boolean m_valid = false;

		for (int i = 0; i < colores.length; i++) {
			if (color.equals(colores[i])) {
				m_valid = true;
			}
		}

		if (!m_valid) {
			color = COLOR;
		}

		return color;

	}

	public void precioFinal() {
		double precioFinal = this.precioBase;

		switch (this.consumoEnerg) {
			case 'A':
				precioFinal += 100;
				break;
	
			case 'B':
				precioFinal += 80;
				break;
	
			case 'C':
				precioFinal += 60;
				break;
	
			case 'D':
				precioFinal += 50;
				break;
	
			case 'E':
				precioFinal += 30;
				break;
	
			case 'F':
				precioFinal += 10;
				break;
		}

		if (this.peso >= 0 && this.peso <= 19) {
			precioFinal += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			precioFinal += 50;
		} else if (this.peso >= 20 && this.peso <= 49) {
			precioFinal += 80;
		} else {
			precioFinal += 100;
		}

		this.precioBase = precioFinal;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnerg=" + consumoEnerg
				+ ", peso=" + peso + "]";
	}
}
