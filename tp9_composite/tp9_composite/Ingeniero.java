package tp9_composite;

import java.util.ArrayList;

public class Ingeniero extends Ejercito{

	public Ingeniero(ArrayList<Ejercito> ejer, int desti) {
		super(ejer, desti);
		ejer.add(this);
	}

	private int lajas;
	
	@Override
	public void caminar() {
		
		this.descontarLaja();
	}

	public int getLajas() {
		return lajas;
	}

	public void setLajas(int lajas) {
		this.lajas = lajas;
	}
	
	public void descontarLaja() {
		if(lajas > 0) {
			lajas = lajas - 1;
		}
	}
}
