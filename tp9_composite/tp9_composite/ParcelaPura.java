package tp9_composite;


//PATRON COMPOSITE
//ROL: Leaf

public class ParcelaPura extends Parcela {
	
	private Cultivo cultivo;
	
	public ParcelaPura(Cultivo cultivo) {
		super();
		this.cultivo = cultivo;
	}

	@Override
	public double getGananciaAnual() {
		return this.cultivo.getGanancia();
	}

}
