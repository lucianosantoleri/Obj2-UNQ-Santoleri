package tp_numsYstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Actividades {

	ArrayList<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public Actividades(ArrayList<ActividadSemanal> activ) {
		this.actividades = activ;
	}
	
	public ArrayList<ActividadSemanal> getActividades() {
		return actividades;
	}
	
	public List<ActividadSemanal> actividadesDeFutbol() {
		
		return actividades.stream().filter(act -> act.getDeporte() == DEPORTE.FUTBOL).collect(Collectors.toList());
	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(String comple) {
		return actividades.stream().filter(act -> act.getDeporte().complejidad == comple).collect(Collectors.toList());
	}
}
