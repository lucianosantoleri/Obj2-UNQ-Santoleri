package tp8_TestDoublesyTDD;

import java.util.ArrayList;
import java.util.Arrays;

public class PokerStatus {

	private ArrayList<ICarta> cartas = new ArrayList<ICarta>();
	
	//recibe las 5 cartas de la mano y retorna true si hubo poker
	public Boolean verificar(ICarta carta1,ICarta carta2, ICarta carta3, ICarta carta4, ICarta carta5) {
		
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		
		boolean contains = ((ArrayList<ICarta>) cartas.stream()).contains(!extracted(carta1, carta2));
		return contains;
	}

	private Boolean extracted(ICarta carta1, ICarta carta2) {
		return compararCartas(carta1,carta2);
	}
	
	public ArrayList<ICarta> getCartas() {
		return cartas;
	}
	
	public void addCarta(ICarta unaCarta) {
		cartas.add(unaCarta);
	}
	
	public void removeCarta(ICarta unaCarta) {
		cartas.remove(unaCarta);
	}
	
	public Boolean compararCartas(ICarta unaCarta, ICarta otraCarta) {
		if (unaCarta.equals(otraCarta)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private static boolean hasPoker(String[] hand) {
        if(hand.length != 5) {
            throw new IllegalArgumentException("Expected 5 cards, got " + hand.length);
        }
        Arrays.sort(hand);
        // Este substring lo que hace es quitar el palo dejando únicamente el número de la carta (A, 2, ..., 10, ..., K)
        String poker = hand[2].substring(0, hand[2].length() - 1);
        return Arrays.stream(hand).filter(el -> el.startsWith(poker)).count() == 4;
    }
}
