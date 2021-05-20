package tp6_Poquer_TDD;

import java.util.ArrayList;

public class PokerStatus {

	//recibe las 5 cartas de la mano y retorna true si hubo poker
	public Boolean verificar(ICarta carta1,ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5) {
		ArrayList<ICarta> cartas = new ArrayList<ICarta>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		
		return null;
	}
}
