package tp4_POOenJava;

public class IngresoPorHorasExtras extends Ingreso {
	
	public int cantidadHorasExtras;

	public IngresoPorHorasExtras(int mes, String concepto, Double montoPercibido, int cantHoras) {
		super(mes, concepto, montoPercibido);
		this.cantidadHorasExtras = cantHoras;
	}
}
