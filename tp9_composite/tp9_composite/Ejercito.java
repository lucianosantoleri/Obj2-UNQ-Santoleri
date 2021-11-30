package tp9_composite;

public class Ejercito extends Peloton {
	//COMPONENTE

	@Override
	public void caminarHasta(Integer destino) {
		this.getSoldados().stream().forEach(soldado -> {	soldado.caminarHasta(destino);	});
		this.setUbicacion(destino);
	}
}