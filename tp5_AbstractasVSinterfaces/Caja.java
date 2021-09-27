import java.util.ArrayList;

import tp4_POOenJava.Producto;

public class Caja {

	private double montoAPagar;
	private static ArrayList<Producto> stockProductos = new ArrayList<Producto>();
	
	public Caja(double monto, ArrayList<Producto> stock) {
		this.montoAPagar = monto;
		Caja.stockProductos = stock;
	}

	public double getMontoAPagar() {
		//this.informarPagoAlCliente(Cliente cliente);
		return montoAPagar;
	}

	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}

	public static ArrayList<Producto> getStockProductos() {
		return stockProductos;
	}

	public static void sacarStockProducto(Producto producto) {
		if(existeProducto(producto)) {
			stockProductos.remove(producto);
			}
	}
	
	public static void aniadirStockProducto(Producto producto) {
		stockProductos.add(producto);
	}
	
	public static Boolean existeProducto(Producto producto) {
		return stockProductos.contains(producto);
	}
}
