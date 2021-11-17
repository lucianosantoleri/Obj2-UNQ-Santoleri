package tp9_composite;

public class Ingeniero extends Ejercito{

	private int lajas;
	
	@Override
	public void caminar(Punto a, Punto b) {
		
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
