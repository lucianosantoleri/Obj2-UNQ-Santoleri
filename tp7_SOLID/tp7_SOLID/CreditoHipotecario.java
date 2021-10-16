package tp7_SOLID;

public interface CreditoHipotecario extends Solicitud {

	public Propiedad getPropiedadGarantia(Cliente cliente);
	public Float montoCuota(Cliente cliente); //no debe superar el 50% de los ingresos mensuales
	public Float noSuperaLimiteEdad(Cliente cliente); //no debe superar los 65 años
	public Float montoTotalSolicitado(Cliente cliente); //el monto no debe ser mayor al 70% del valor fiscal de su propiedad
}
