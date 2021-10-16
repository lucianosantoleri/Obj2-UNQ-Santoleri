package tp7_SOLID;

public interface CreditoPersonal extends Solicitud {

	public Propiedad getPropiedadGarantia(Cliente cliente);
	public Float montoCuota(Cliente cliente); //no debe superar el 70% de los ingresos mensuales
	public Float ingresoAnualSuperador(Cliente cliente); //su ingreso anual sea mayor a 15mil.
}
