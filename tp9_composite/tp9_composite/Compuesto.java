package tp9_composite;

public abstract class Compuesto implements Parcela {

	private Parcela objeto;
	int precio;
	
	public Parcela composicion() {
		return objeto;
	}
	
	public Soja soja() {
		return (Soja) objeto;
	}
	
	public Trigo trigo() {
		return (Trigo) objeto;
	}
	
	public int preciosTotal() {
		return objeto.getPrecio();
	}

	public Boolean verificarCompuesto() {
		return null;
	}
	
	public abstract int getPrecio();
}
