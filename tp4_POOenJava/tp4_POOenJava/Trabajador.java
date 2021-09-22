package tp4_POOenJava;

import java.util.ArrayList;

//EJERCICIO 3

public class Trabajador {

	private double montoTotalPercibido;
	private double montoImponible;
	private double montoImpuestoAPagar = (montoImponible * 2) /100; //calculado como el 2% del monto Imponible.
	private ArrayList<Ingreso> ingresosAnuales = new ArrayList<Ingreso>();
	
	public double getMontoTotalPercibido() {
		return montoTotalPercibido;
	}
	public void setMontoTotalPercibido(double montoTotalPercibido) {
		this.montoTotalPercibido = montoTotalPercibido;
	}
	public double getMontoImponible() {
		return montoImponible;
	}
	public void setMontoImponible(double montoImponible) {
		this.montoImponible = montoImponible;
	}
	public double getMontoImpuestoAPagar() {
		return montoImpuestoAPagar;
	}
	public void setMontoImpuestoAPagar(double montoImpuestoAPagar) {
		this.montoImpuestoAPagar = montoImpuestoAPagar;
	}
	public ArrayList<Ingreso> getIngresosAnuales() {
		return ingresosAnuales;
	}
}
