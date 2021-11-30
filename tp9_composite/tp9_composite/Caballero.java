package tp9_composite;

import java.util.List;

public class Caballero extends Peloton {
	// HOJA

	@Override
	public void caminarHasta(Integer destino) {
		this.caminarEnZigZagHasta(destino);
	}

	private void caminarEnZigZagHasta(Integer destino) {
		// Para ir de un punto a otro debe caminar en zigzag para controlar que no haya enemigos.
		this.setUbicacion(destino);
		
	}
	
	@Override
	public void reclutar(Peloton soldado) {
		System.out.println("No tiene la autoridad para reclutar");
	}
	
	@Override
	public List<Peloton> getSoldados() {
		System.out.println("No tiene la autoridad para estar a cargo de ning�n pelot�n");
		return null;
	}
	
	@Override
	public void desterrar(Peloton soldados) {
		System.out.println("No tiene la autoridad para desterrar a ning�n soldado");
	}

}