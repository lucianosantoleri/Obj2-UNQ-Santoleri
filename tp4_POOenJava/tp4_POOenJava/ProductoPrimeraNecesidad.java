package tp4_POOenJava;

public class ProductoPrimeraNecesidad {

	private String nombre;
	private double precioBase;
	public boolean esPrecioCuidado;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precioBase;
	}

	public void setPrecio(double valor) {
		this.precioBase = valor;
	}
	
	public ProductoPrimeraNecesidad(String string, double precio, boolean b) {
		this.nombre = string;
		this.precioBase = precio;
		this.esPrecioCuidado = b;
	}

	public double precioPrimeraNecesidad() {
		return this.getPrecio() * 0.9;
	}
}
