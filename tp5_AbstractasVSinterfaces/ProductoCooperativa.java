
public class ProductoCooperativa extends Producto {
	
	@Override
	public double getValor() {
		return precioConDescuentoAplicado();
	}

	//se aplica descuento de IVA
	private Double precioConDescuentoAplicado() {
		double descuento = (super.getValor() * 10) / 100;
		return super.getValor() - descuento;
	}

	@Override
	public void aumentarPrecio(double aumento) {
		this.valor = valor + aumento;
	}
}
