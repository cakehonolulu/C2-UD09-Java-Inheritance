package Task4;

import java.util.ArrayList;

public class Raices {
	private double a;
	private double b;
	private double c;

	public Raices(double a, double b, double c) {
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
	
	public boolean tieneRaiz() {
		if (this.getDscriminante() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void calcular() {
		double suma=(-b + Math.sqrt((Math.pow(b, 2) - (4 * this.a * this.c)))/ (2/this.a));
		double resta=(-b - Math.sqrt((Math.pow(b, 2) - (4 * this.a * this.c)))/ (2/this.a));		
		
			if (this.getDscriminante()<0) {//uno tiene solucion
				System.out.println("No tiene solucion");
			} else if(this.getDscriminante()==0 ){//una soluciones
				System.out.println("Resultado es " + suma);
			}else {
				System.out.println("Resultado suma: "+ suma + "\nResultado resta: " + resta);
			}	
		
	}
	
	
	
	
	

}
