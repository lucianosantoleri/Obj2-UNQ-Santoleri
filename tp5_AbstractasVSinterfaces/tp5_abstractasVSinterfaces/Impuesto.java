package tp5_abstractasVSinterfaces;

public class Impuesto extends Factura {
	
	private double costoFijo;
	
	public Impuesto(double costoAPagar) {
		this.costoFijo = costoAPagar;
	}

	public double getCostoFijo() {
		return costoFijo;
	}

	@Override
	public double montoAPagar() {
		return costoFijo;
	}
}
