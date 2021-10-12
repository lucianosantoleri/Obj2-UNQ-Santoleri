package tp_numsYstreams;

import java.util.ArrayList;
import java.util.stream.*;

public class Actividades {

	ArrayList<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public Actividades(ArrayList<ActividadSemanal> activ) {
		this.actividades = activ;
	}
	
	public ArrayList<ActividadSemanal> getActividades() {
		return actividades;
	}
	
	public ArrayList<ActividadSemanal> actividadesDeFutbol() {
		
		return actividades.stream().filter(act -> act.getDeporte() == DEPORTE.FUTBOL);
	}
}
