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
		contador.addNumber((double) 1);
		contador.addNumber((double) 3);
		contador.addNumber((double) 5);
		contador.addNumber((double) 7);
		contador.addNumber((double) 9);
		contador.addNumber((double) 1);
		contador.addNumber((double) 1);
		contador.addNumber((double) 1);
		contador.addNumber((double) 1);
		contador.addNumber((double) 4);
	}
	
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		Double amount = contador.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 1);
		}
}
