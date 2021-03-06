package tp4_POOenJava;

import java.util.*;

public class Caja {

	private float montoTotal;
	private static ArrayList<Producto> stockProductos = new ArrayList<Producto>();
	
	public float getMontoTotalAPagar() {
		return montoTotal;
	}
	
	public ArrayList<Producto> getStockProductos() {
		return stockProductos;
	}
	
	public void registrarProducto(Producto producto) {
		montoTotal = (float) (montoTotal + producto.getPrecio());
		stockProductos.remove(producto);
	}
	
	public void aniadirProductoAlStock(Producto producto) {
		stockProductos.add(producto);
	}
	
	public void removerProductoDelStock(Producto producto) {
		stockProductos.remove(producto);
	}
}
