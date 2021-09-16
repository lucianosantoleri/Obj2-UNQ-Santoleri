package tp4_POOenJava;

import java.util.function.BooleanSupplier;

public class Producto {

	private double valor;
	private String nombre;
	
	public Producto(String nombre, double precio, boolean b) {
		this.valor = precio;
		this.nombre = nombre;
	}

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

	public Double getPrecio() {
		
		return null;
	}

	public BooleanSupplier esPrecioCuidado() {
		
		return null;
	}

	public void aumentarPrecio(double aumento) {
		this.valor = valor + aumento;
	}
}
