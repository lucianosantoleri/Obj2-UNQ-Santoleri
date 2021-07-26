package tp3_introAjava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PuntoRectanguloCuadradoTestCase {

	
	private Point punto;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		punto = new Point();
	}
	
	@Test
	public void testeandoPuntoSinValores() {
	assertEquals(punto, 0);
	}
}
