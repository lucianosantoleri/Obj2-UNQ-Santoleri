package tp9_composite;

//PATRON COMPOSITE
//ROL: Component

public abstract class Parcela {

	public abstract double getGananciaAnual();
	
	public void agregarParcela(Parcela parcela) {
		// Metodo hook
	}
	
	public void eliminarParcela(Parcela parcela) {
		// Metodo hook
	}
	
	public Parcela getChild(int nro) {
		return null;
	}
}
