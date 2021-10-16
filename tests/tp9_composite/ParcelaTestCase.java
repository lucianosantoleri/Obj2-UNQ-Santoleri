package tp9_composite;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import tp6_Poquer_TDD.ICarta;
import tp6_Poquer_TDD.PokerStatus;
import tp7_composite.Compuesto;
import tp7_composite.Parcela;

public class ParcelaTestCase {

		private Compuesto parcela;
		private Parcela compuesto1;
		private Parcela compuesto2;
		private Parcela compuesto3;
		private Parcela compuesto4;
		private Parcela compuesto5;
		
		@Before
		public void SetUp() {
			
			//sut
			parcela = new Compuesto();
			
			//doc
			compuesto1 = mock(Parcela.class); //"JD"
			compuesto2 = mock(Parcela.class); //"10P"
			compuesto3 = mock(Parcela.class);//"JP"
			compuesto4 = mock(Parcela.class);//"JT"
			compuesto5 = mock(Parcela.class);//"JC"
			
		}
		
		@Test
		public void testeandoTipoDelCompuesto() {
			
			//exercise
			Boolean resultado = parcela.verificarCompuesto();
			
			//verify
			assertTrue(resultado);
		}
		
		@Test
		public void test() {
			
		}
}

