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

	public double getDiscriminante() {
		double discriminante = Math.pow(this.b, 2) - 4 * this.a * this.c;
		return discriminante;
	}

	public boolean tieneRaices() {
		if (this.getDiscriminante() >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tieneRaiz() {
		if (this.getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void calcular() {
		double suma = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		double resta = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		
			if (this.getDiscriminante()<0) {//uno tiene solucion
				System.out.println("No tiene solucion");
			} else if(this.getDiscriminante()==0 ){//una soluciones
				System.out.println("La solución es " + suma);
			}else {
				System.out.println("Las soluciones son : "+ suma + " y: " + resta);
			}	
		
	}
	
	public void obtenerRaices() {
		double primeraSolucion = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		double segundaSolucion = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		System.out.println("x1: " + primeraSolucion + " x2: " + segundaSolucion);
	}
	
	public void obtenerRaiz() {
		double solucionUnica = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		System.out.println("x: " + solucionUnica);
	}

}
