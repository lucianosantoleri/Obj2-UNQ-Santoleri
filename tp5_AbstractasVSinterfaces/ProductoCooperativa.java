
public class ProductoCooperativa extends Producto {
	
	@Override
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String getNombre() {
		return getNombre();
	}

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
