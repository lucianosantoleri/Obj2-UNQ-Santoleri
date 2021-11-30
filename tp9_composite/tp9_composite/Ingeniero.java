package tp9_composite;

import java.util.List;

public class Ingeniero extends Peloton{
	// HOJA

	private int lajas;

	public Ingeniero(int lajas) {
		setLajas(lajas);
	}

	private void setLajas(int lajas) {
		this.lajas = lajas;
	}

	public int getLajas() {
		return this.lajas;
	}

	@Override
	public void caminarHasta(Integer destino) {
		this.trazarCaminoCortoHacia(destino);		
		this.caminarYDejarLajasHacia(destino);		
		this.setUbicacion(destino);
		
	}

	public void caminarYDejarLajasHacia(Integer destino) {
		for(int paso=1; paso<=destino; paso++) {
			this.setUbicacion(paso);
			this.dejarLaja();
		}
	}
	
	public void dejarLaja() {
		if (this.getLajas() > 0) {
			setLajas(this.getLajas() - 1);
			System.out.println("Se ha dejado una laja en el camino. Quedan " + this.getLajas());
		} else {
			System.out.print("No hay m�s lajas en la bolsa para dejar. El Ingeniero continuar� su camino normalmente. ");
			System.out.println("Ya ha dado " + this.getUbicacion() + " pasos.");
		}							
	}

	public Integer trazarCaminoCortoHacia(Integer destino) {
		System.out.println("El Ingeniero ha trazado el camino hacia el destino. Se deben dar " + destino + " pasos.");
		System.out.println("Dispone de  " + this.getLajas() + " lajas en su bolsa.");
		return destino;
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