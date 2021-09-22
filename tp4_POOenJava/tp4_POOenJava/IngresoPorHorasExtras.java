package tp4_POOenJava;

//EJERCICiO 3

public class IngresoPorHorasExtras extends Ingreso {
	
	public int cantidadHorasExtras;

	public IngresoPorHorasExtras(int mes, String concepto, Double montoPercibido, int cantHoras) {
		super(mes, concepto, montoPercibido);
		this.cantidadHorasExtras = cantHoras;
	}
}
