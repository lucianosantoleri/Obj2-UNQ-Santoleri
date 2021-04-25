package tp3_introAjava;

import tp3_introAjava.Counter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {

	private Counter contador;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//se crea el contador
		contador = new Counter();
		
		//se agregan los numeros. Un solo impar y nueve impares
		contador.addNumber((Integer) 1);
		contador.addNumber((Integer) 3);
		contador.addNumber((Integer) 5);
		contador.addNumber((Integer) 7);
		contador.addNumber((Integer) 9);
		contador.addNumber((Integer) 1);
		contador.addNumber((Integer) 1);
		contador.addNumber((Integer) 1);
		contador.addNumber((Integer) 1);
		contador.addNumber((Integer) 4);
	}
	
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		Double amount = contador.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 9);
		}
	
	@Test
	public void testeandoCantidadDePares() {
		assertEquals(contador.cantidadDePares(),1);
	}
	
	@Test
	public void testeandoCantidadDeImpares() {
		assertEquals(contador.cantidadImpares(),9);
	}
}
