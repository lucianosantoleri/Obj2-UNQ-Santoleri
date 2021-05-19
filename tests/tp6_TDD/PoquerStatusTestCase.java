package tp6_TDD;

import tp6_Poquer_TDD.PokerStatus;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.*;


public class PoquerStatusTestCase {

	private PokerStatus pokerStatus;
	private String carta1;
	private String carta2;
	private String carta3;
	private String carta4;
	private String carta5;
	
	@Before
	public void SetUp() {
		pokerStatus = new PokerStatus();
		carta1 = "JD";
		carta2 = "10P";
		carta3 = "JP";
		carta4 = "JT";
		carta5 = "JC";
		
	}
	
	@Test
	public void testeandoRetornoDelEstatusDelPoker() {
		assertEquals(pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5), true);
	}
}
