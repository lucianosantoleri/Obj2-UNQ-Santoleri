
public class Servicio extends Factura {
	
	private double costoUnidad;
	private double cantidadUnidades;

	public Servicio(double precioUnidad, double cantUnidades) {
		this.setCantidadUnidades(cantUnidades);
		this.setCostoUnidad(precioUnidad);
	}

	public double getCostoUnidad() {
		return costoUnidad;
	}

	public void setCostoUnidad(double costoUnidad) {
		this.costoUnidad = costoUnidad;
	}

	public double getCantidadUnidades() {
		return cantidadUnidades;
	}

	public void setCantidadUnidades(double cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}
	
	@Override
	public double montoAPagar() {
		return this.getCantidadUnidades() * this.getCostoUnidad();
	}
}
