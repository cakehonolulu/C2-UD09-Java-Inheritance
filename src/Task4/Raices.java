package Task4;

public class Raices {
	private double a;
	private double b;
	private double c;

	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDscriminante() {
		double discriminante = Math.pow(this.b, 2) - 4 * this.a * this.c;
		return discriminante;
	}

	public boolean tieneRaices() {
		if (this.getDscriminante() >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
