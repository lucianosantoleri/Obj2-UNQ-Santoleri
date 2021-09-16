package tp4_POOenJava;

public class ProductoCooperativa extends Producto {

	public void aplicarDescuentoIVA() {
		float nuevoValor = (float) (super.getValor() - (super.getValor() * 0.1));
		super.setValor(nuevoValor);
	}
}
