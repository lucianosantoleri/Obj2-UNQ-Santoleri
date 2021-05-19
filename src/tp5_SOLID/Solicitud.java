package tp5_SOLID;

public abstract interface Solicitud {

	public Cliente esSolicitante(Cliente cliente);
	public Float montoSolicitud();
	public int plazoEnMeses(Cliente cliente);
}
