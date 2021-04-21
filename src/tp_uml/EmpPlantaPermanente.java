package tp_uml;

public class EmpPlantaPermanente extends Empleado {

	
	
	@Override
	public Float retencionObraSocial() {
		Float calculo;
		calculo = this.calculoDeSueldoBruto();
		return (calculo*10)/100;
	}
}
