package tp3_introAjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

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
