package tp9_composite;

import java.util.List;

//PATRON COMPOSITE
//ROL: Client

public class Sistema {
	
	/**
	 *  Las porciones productivas de tierra que se agregan al sistema siempre son 4.
	 */

	private List<Parcela> porcionesProductivasDeTierra;

	public Sistema(List<Parcela> porcionesProductivasDeTierra) {
		super();
		this.porcionesProductivasDeTierra = porcionesProductivasDeTierra;
	}
	
	public double getGananciaAnualTotal() {
		double gananciaTotal = this.porcionesProductivasDeTierra.stream().
				mapToDouble(pp->pp.getGananciaAnual()).sum();
		return gananciaTotal;
	}
}
