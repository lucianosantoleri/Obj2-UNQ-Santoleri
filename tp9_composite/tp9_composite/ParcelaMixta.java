package tp9_composite;

import java.util.ArrayList;
import java.util.List;

// PATRON COMPOSITE
// ROL: Composite

public class ParcelaMixta extends Parcela {
	
	private List<Parcela> parcelas;

	public ParcelaMixta() {
		super();
		this.parcelas = new ArrayList<Parcela>();
	}
	
	@Override
	public double getGananciaAnual() {
		double gananciaTotal = this.parcelas.stream().
				mapToDouble(parcela->parcela.getGananciaAnual() / 4).sum();
		return gananciaTotal;
	}
	
	@Override
	public void agregarParcela(Parcela parcela) {
		if (this.parcelas.size() < 4) {
			this.parcelas.add(parcela);
		}
	}
	
	@Override
	public void eliminarParcela(Parcela parcela) {
		this.parcelas.remove(parcela);
	}
	
	@Override
	public Parcela getChild(int nro) {
		return this.parcelas.get(nro);
	}

}
