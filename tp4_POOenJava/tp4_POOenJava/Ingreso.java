package tp4_POOenJava;

public class Ingreso {

	
	public int mesDePercepcion;
	public String concepto;
	private Double montoPercibido;
	
	public Ingreso(int mes, String concepto, Double montoPercibido) {
		
		this.mesDePercepcion = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public Double getMontoPercibido() {
		return montoPercibido;
	}
}
