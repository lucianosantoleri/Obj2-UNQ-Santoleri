package tp9_composite;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

public class EjercitoTestCase {

	private Ingeniero ejercito;
	private Caballero caballero;
	private Ingeniero ingeniero;
	
	@Before
	public void SetUp() {
		
		//sut
		ejercito = new Ingeniero(null, 6);
		
		//doc
		caballero = mock(Caballero.class);
		ingeniero = mock(Ingeniero.class);
	}
	

	@Test
	public void test() {
		
	}
}
