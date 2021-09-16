package tp4_POOenJava;

public class Producto {

	private double valor;
	private String nombre;
	public boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio, boolean b) {
		this.valor = precio;
		this.nombre = nombre;
		this.esPrecioCuidado = b;
	}

	public void setPrecio(double valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return valor;
	}

	public boolean esPrecioCuidado() {
		return false;
	}

	public void aumentarPrecio(double aumento) {
		this.valor = valor + aumento;
	}
}
