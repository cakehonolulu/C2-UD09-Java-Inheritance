package Task5;

public class Persona {

		String nombre;
		int edad;
		String sexo;
		boolean asistencia;
		
		public Persona() {
			this.nombre = "";
			this.edad = 0;
			this.sexo = "";
			this.asistencia = false;
		}
		
		public Persona(String nombre, int edad, String sexo, boolean asistencia) {
			this.nombre = nombre;
			this.edad = edad;
			this.sexo = sexo;
			this.asistencia = asistencia;
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

		public boolean getAsistencia() {
			return asistencia;
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

		public void setAsistencia() {
			/*
			 * Dummy function
			 * 
			 * Each inherited class will treat the attendance
			 * differently.
			 * 
			 * Leave it as it.
			 */
		}

}
