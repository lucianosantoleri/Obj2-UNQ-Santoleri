package tp3_introAjava;

import tp3_introAjava.Counter;
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
		contador.add(1);
		contador.add(3);
		contador.add(5);
		contador.add(7);
		contador.add(9);
		contador.add(1);
		contador.add(1);
		contador.add(1);
		contador.add(1);
		contador.add(4);
	}
	
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		Double amount = counter.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 9);
		}
}
