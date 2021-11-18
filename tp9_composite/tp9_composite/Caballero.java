package tp9_composite;

import java.util.ArrayList;

public class Caballero extends Ejercito{

	public Caballero(ArrayList<Ejercito> ejer, int desti) {
		super(ejer, desti);
		ejer.add(this);
	}

	@Override
	public void caminar() {
		this.enZigzag();
	}

	private void enZigzag() {
	}
}
