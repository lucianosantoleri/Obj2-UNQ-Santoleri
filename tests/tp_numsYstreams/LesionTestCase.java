package tp_numsYstreams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LesionTestCase {

	public Lesion ROJO;
	private Lesion GRIS;
	private Lesion AMARILLO;
	private Lesion MIEL;
	
	@BeforeEach
	public void setUp() {
		ROJO.setNivelRiesgo(20);
		GRIS.setNivelRiesgo(15);
		AMARILLO.setNivelRiesgo(10);
		MIEL.setNivelRiesgo(5);
	}
 	
	@Test
	public void testNivelRiesgoDeRojo() {
		assertEquals(ROJO.getNivelRiesgo(),20);
	}
	
	@Test
	public void testNivelRiesgoGris() {
		assertEquals(GRIS.getNivelRiesgo(),15);
	}
	
	@Test
	public void testNivelRiesgoAmarillo() {
		assertEquals(AMARILLO.getNivelRiesgo(),10);
	}
	
	@Test
	public void testNivelRiesgoMiel() {
		assertEquals(MIEL.getNivelRiesgo(),5);
	}
}
