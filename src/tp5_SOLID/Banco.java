package tp5_SOLID;

import java.util.ArrayList;

public class Banco {

	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Solicitud> solicitudes = new ArrayList<Solicitud>();

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void eliminarCliente(Cliente cliente) {
		clientes.remove(cliente);
	}
	
	public void registrarSolicitudCredito(Solicitud solicitud) {
		
	}
	
	public void otorgarCredito(Cliente cliente) {
		
	}
	
	public Float montoTotalSolicitudes() {
		return null; //codificar
	}
}
