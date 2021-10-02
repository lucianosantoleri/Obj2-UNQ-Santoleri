package tp4_POOenJava;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(String nombre, double precio, boolean b) {
		super(nombre, precio, b);
	}

	public void aplicarDescuentoIVA() {
		float nuevoValor = (float) (super.getPrecio() - (super.getPrecio() * 0.1));
		super.setPrecio(nuevoValor);
	}
}
