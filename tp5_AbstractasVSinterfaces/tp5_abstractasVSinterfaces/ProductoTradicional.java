package tp5_abstractasVSinterfaces;

public class ProductoTradicional extends Producto {

	@Override
	public void aumentarPrecio(double aumento) {
		this.valor = valor + aumento;
	}
}
