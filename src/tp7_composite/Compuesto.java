package tp7_composite;

public class Compuesto implements Parcela {

	private Parcela objeto;
	
	public Parcela composicion() {
		return objeto;
	}
	
	public Soja hoja() {
		return (Soja) objeto;
	}
	
	public Trigo trigo() {
		return (Trigo) objeto;
	}
}
