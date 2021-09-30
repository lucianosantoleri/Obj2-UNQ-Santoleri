package tp5_abstractasVSinterfaces;
public class Persona extends SerVivo {

		private String apellido;
		private String fechaNac;
		private int edad;
		
		public Persona(String nombre, String apellido, String fechaNac, int edad) {
			super.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.fechaNac = fechaNac;
		}
		
		public String getNombre() {
			return super.nombre;
		}
		
		public String getApellido() {
			return apellido;
		}

		public int getEdad() {
			return edad;
		}
		
		public Boolean menorQue(Persona otraPersona) {
			return this.edad < otraPersona.getEdad();
		}

		public String getFechaNac() {
			return fechaNac;
		}
}
