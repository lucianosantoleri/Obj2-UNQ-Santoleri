package tp4_POOenJava;

public class ProductoPrimeraNecesidad {

	private String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	private double valor;
	
	public ProductoPrimeraNecesidad(String string, double precio, boolean b) {
		this.nombre = string;
		this.valor = precio;
	}

}
