package Task1;

public class Electrodomestico {
		public String colores[] = new String[] {"blanco", "negro", "rojo", "azul", "gris"};
		public char consumos[] = new char[] {'A', 'F'};
		
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
	    	consumoEnerg = comprobarConsumoEnergetico(consumoEnerg);
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
	    
	    @Override
	    public String toString() {
	        return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnerg=" + consumoEnerg
	                + ", peso=" + peso + "]";
	    }
}
