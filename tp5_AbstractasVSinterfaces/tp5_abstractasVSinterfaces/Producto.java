package tp5_abstractasVSinterfaces;

public abstract class Producto {

		protected double valor;
		private String nombre;

		public abstract void aumentarPrecio(double aumento);
		
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
