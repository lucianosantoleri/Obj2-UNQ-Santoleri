package tp9_composite;

import java.util.*;

public abstract class Ejercito implements IEejercito {
	
	protected ArrayList<Ejercito> ejercito = new ArrayList<Ejercito>();
	protected int destino;
	
	public Ejercito(ArrayList<Ejercito> ejer, int desti) {
		this.ejercito = ejer;
		this.destino = desti;
	}

	public void aniadirAlEjercito(Ejercito miembro) {
		ejercito.add(miembro);
	}
	
	public abstract void caminar();
}
