package Task5;

public class Persona {

		String nombre;
		int edad;
		String sexo;
		
		public Persona() {
			this.nombre = "";
			this.edad = 0;
			this.sexo = "";
		}
		
		public Persona(String nombre, int edad, String sexo) {
			this.nombre = nombre;
			this.edad = edad;
			this.sexo = sexo;
		}

		public String getNombre() {
			return nombre;
		}

		public int getEdad() {
			return edad;
		}

		public String getSexo() {
			return sexo;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		
}
