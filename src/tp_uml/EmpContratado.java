package tp_uml;

import java.util.Date;

public class EmpContratado extends Empleado {
	
	private int numeroContrato;
	private String medioDePago;

	public EmpContratado(String nombre, String direccion, String estadoCivil, Date fechaNac, Float sueldoBasico,
			             int nroContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.numeroContrato = nroContrato;
		this.medioDePago = medioDePago;
	}

	@Override
	public Float calculoDeSueldoBruto() {
		return null;
	}

	@Override
	public Float retencionesAplicadas() {
		return null;
	}

	@Override
	public Float retencionObraSocial() {
		return null;
	}

}
