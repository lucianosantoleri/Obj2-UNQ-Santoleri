package tp3_introAjava;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp3_introAjava.Multioperador;

public class MultioperadorTestCase {

private Multioperador operador;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//se crea el contador
		operador = new Multioperador();
		
		//se agregan los numeros. Un solo impar y nueve impares
		operador.addNumber((Integer) 1);
		operador.addNumber((Integer) 3);
		operador.addNumber((Integer) 5);
		operador.addNumber((Integer) 7);
		operador.addNumber((Integer) 9);
		operador.addNumber((Integer) 1);
		operador.addNumber((Integer) 1);
		operador.addNumber((Integer) 1);
		operador.addNumber((Integer) 1);
		operador.addNumber((Integer) 4);
	}
	
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		Double amount = operador.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 9);
		}
	
	@Test
	public void testeandoCantidadDePares() {
		assertEquals(operador.cantidadDePares(),1);
	}
	
	@Test
	public void testeandoCantidadDeImpares() {
		assertEquals(operador.cantidadImpares(),9);
	}
	
	@Test
	public void testeandoOperaciones() {
		assertEquals(operador.sumar(),33);
	}
}
