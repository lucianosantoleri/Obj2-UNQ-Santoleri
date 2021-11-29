package tp10_observer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SistemaDeReferencias {

	List<ISuscriptor> suscriptores = new ArrayList<ISuscriptor>();
	
	public SistemaDeReferencias(List<ISuscriptor> suscribers) {
		this.suscriptores = suscribers;
	}
	
	public void suscribirse(ISuscriptor suscriptor) {
		suscriptores.add(suscriptor);
	}
	
	public void desescribirse(ISuscriptor suscriptor) {
		suscriptores.remove(suscriptor);
	}
	
	public void notificar(String tipoEvento, File file) {
		for(ISuscriptor suscriptor : suscriptores) {
			suscriptor.update(tipoEvento, file);
		}
	}
}
