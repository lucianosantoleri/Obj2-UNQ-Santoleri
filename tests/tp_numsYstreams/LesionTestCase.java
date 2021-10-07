package tp_numsYstreams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LesionTestCase {

	private Lesion rojo;
	private Lesion gris;
	private Lesion amarillo;
	private Lesion miel;
	
	/*private rojo = new Lesion.ROJO();
	private gris = new Lesion.GRIS();
	private amarillo = new Lesion.AMARILLO();
	private miel = new Lesion.MIEL();*/
	
	
	@BeforeEach
	public void setUp() {
		rojo.setNivelRiesgo(20);
		gris.setNivelRiesgo(15);
		amarillo.setNivelRiesgo(10);
		miel.setNivelRiesgo(5);
		rojo.setDescripcion("Maximo riesgo");
		gris.setDescripcion("Riesgo avanzado");
		amarillo.setDescripcion("Riesgo medio");
		miel.setDescripcion("apenas riesgoso");
	}
 	
	@Test
	public void testNivelRiesgoDeRojo() {
		assertEquals(rojo.getNivelRiesgo(),20);
	}
	
	@Test
	public void testNivelRiesgoGris() {
		assertEquals(gris.getNivelRiesgo(),15);
	}
	
	@Test
	public void testNivelRiesgoAmarillo() {
		assertEquals(amarillo.getNivelRiesgo(),10);
	}
	
	@Test
	public void testNivelRiesgoMiel() {
		assertEquals(miel.getNivelRiesgo(),5);
	}
}
