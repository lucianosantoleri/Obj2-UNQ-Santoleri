package tp4_interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp4_POOenJava.Caja;
import tp4_POOenJava.Producto;
import tp4_POOenJava.ProductoCooperativa;

public class testeo {

private Caja caja;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//se crea la caja y los productos
		caja = new Caja();
		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		Producto producto3 = new Producto();
		ProductoCooperativa producto4 = new ProductoCooperativa();
		
		//seteo nombres y valores
		producto1.setNombre("Zanahoria");
		producto1.setValor(60);
		producto2.setNombre("Tomate");
		producto2.setValor(82);
		producto3.setNombre("Verdeo");
		producto3.setValor(45);
		producto4.setNombre("Zapallo");
		producto4.setValor(110);
		producto4.aplicarDescuentoIVA();
		
		//se agregan los productos al stock
		caja.aniadirProductoAlStock(producto1);
		caja.aniadirProductoAlStock(producto2);
		caja.aniadirProductoAlStock(producto3);
		caja.aniadirProductoAlStock(producto4);
		caja.registrarProducto(producto1);
		caja.registrarProducto(producto2);
		caja.registrarProducto(producto3);
		caja.registrarProducto(producto4);
	}
	
	@Test
	public void testeoPrecioTotal() {
		assertEquals(caja.getMontoTotalAPagar(), 286);
		}
}
