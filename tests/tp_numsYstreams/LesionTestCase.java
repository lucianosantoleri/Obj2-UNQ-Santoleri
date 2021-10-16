package tp_numsYstreams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LesionTestCase {
	
	@BeforeEach
	public void setUp() {
	}
 	
	@Test
	public void testNivelRiesgoDeRojo() {
		assertEquals(Lesion.ROJO.getNivelRiesgo(),20);
	}
	
	@Test
	public void testNivelRiesgoGris() {
		assertEquals(Lesion.GRIS.getNivelRiesgo(),15);
	}
	
	@Test
	public void testNivelRiesgoAmarillo() {
		assertEquals(Lesion.AMARILLO.getNivelRiesgo(),10);
	}
	
	@Test
	public void testSiguienteRojo() {
		assertEquals(Lesion.ROJO.siguienteDeRojo(), Lesion.GRIS);
	}
	
	@Test
	public void testSiguienteGris() {
		assertEquals(Lesion.GRIS.siguienteDeGris(), Lesion.AMARILLO);
	}
	
	@Test
	public void testSiguienteAmarillo() {
		assertEquals(Lesion.AMARILLO.siguienteDeAmarillo(), Lesion.MIEL);
	}
	
	@Test
	public void testSiguienteMiel() {
		assertEquals(Lesion.MIEL.siguienteDeMiel(), Lesion.ROJO);
	}
}
