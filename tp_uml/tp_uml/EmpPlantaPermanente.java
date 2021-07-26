package tp_uml;

import java.util.Date;

public class EmpPlantaPermanente extends Empleado {

	private int cantidadHijos;
	private int antiguedad;
	
	public EmpPlantaPermanente(String nombre, String direccion, String estadoCivil, Date fechaNac, Float sueldoBasico,
			                   int cantHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.cantidadHijos = cantHijos;
		this.antiguedad = antiguedad;
	}

	@Override
	public Float retencionObraSocial() {
		Float calculo;
		calculo = this.calculoDeSueldoBruto();
		return (calculo*10)/100;
	}

	@Override
	public Float calculoDeSueldoBruto() {
		return null;
	}

	@Override
	public Float retencionesAplicadas() {
		return null;
	}
}
