package Task1;

public class Task1App {
	
	public static void main(String[] args) {
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		electrodomesticos[0] = new Electrodomestico(120, "bLanco", 'Z', 80);
		electrodomesticos[1] = new Electrodomestico(20, "Negro", 'A', 5);
		electrodomesticos[2] = new Television(250, "amarillo", 'B', 50, 40, true);
		electrodomesticos[3] = new Lavadora(300, "azul", 'C', 150, 40);
		electrodomesticos[4] = new Electrodomestico(60, 25);
		electrodomesticos[5] = new Television();
		electrodomesticos[6] = new Television(500, 60);
		electrodomesticos[7] = new Lavadora();
		electrodomesticos[8] = new Lavadora(400, 160);
		electrodomesticos[9] = new Electrodomestico(100, "ROSA", 'Z', 200);
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			System.out.println(electrodomesticos[i]);
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			electrodomesticos[i].precioFinal();
			System.out.println(electrodomesticos[i]);
		}
		
	}

}
