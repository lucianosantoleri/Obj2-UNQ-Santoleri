package tp11_templateMethodyAdapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTestCase {

	private Empleado temporario;
	private Empleado pasante;
	public Empleado dePlanta;
	
	@BeforeEach
	public void setUp() {
		
		//sut
		temporario = new Temporario(220, 3);
		pasante = new Pasante(730, 0);
		dePlanta = new DePlanta(0, 4);
	}
	
	@Test
	public void testSueldoTemporario() {
		
		assertEquals(temporario.sueldo(), 2200);
	}
	
	@Test
	public void testSueldoPasante() {
		
		assertEquals(pasante.sueldo(), 29200);
	}
	
	@Test public void testSueldoDePlanta() {
		
		assertEquals(dePlanta.sueldo(), 3210);
	}
}
