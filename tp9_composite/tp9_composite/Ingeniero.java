package tp9_composite;

import java.util.ArrayList;

public class Ingeniero extends Ejercito{

	private int lajas;
	
	public Ingeniero(ArrayList<Ejercito> ejer, int desti) {
		super(ejer, desti);
		ejer.add(this);
	}
	
	@Override
	public void caminar() {
		this.descontarHaciaElDestino();
		this.descontarLaja();
	}

	private void descontarHaciaElDestino() {
		if(super.destino > 0) {
			super.destino = super.destino - 1;
		}
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
