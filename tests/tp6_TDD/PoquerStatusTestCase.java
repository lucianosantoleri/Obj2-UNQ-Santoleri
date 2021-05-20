package tp6_TDD;

import tp6_Poquer_TDD.ICarta;
import tp6_Poquer_TDD.PokerStatus;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

import static org.mockito.Mockito.*;


public class PoquerStatusTestCase {

	private PokerStatus pokerStatus;
	private ICarta carta1;
	private ICarta carta2;
	private ICarta carta3;
	private ICarta carta4;
	private ICarta carta5;
	
	@Before
	public void SetUp() {
		
		pokerStatus = new PokerStatus();
		carta1 = mock(ICarta.class); //"JD"
		carta2 = mock(ICarta.class); //"10P"
		carta3 = mock(ICarta.class);//"JP"
		carta4 = mock(ICarta.class);//"JT"
		carta5 = mock(ICarta.class);//"JC"
		
	}
	
	@Test
	public void testeandoRetornoDelEstatusDelPoker() {
		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), true);
	}
	
	@Test
	public void test() {
		
	}
}
