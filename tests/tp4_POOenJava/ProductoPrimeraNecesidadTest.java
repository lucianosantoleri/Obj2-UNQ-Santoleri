package tp4_POOenJava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad producto;
	
	@BeforeEach
	public void setUp() {
		producto = new ProductoPrimeraNecesidad("Leche", 8d, false);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(8.0), producto.getPrecio());
	}
}
