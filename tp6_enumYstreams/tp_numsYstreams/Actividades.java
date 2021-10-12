package tp_numsYstreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	
	public int cantidadHorasTotales() {
		return actividades.stream().mapToInt(act -> act.getDuracion()).sum();
	}
	
	//se sabe de antemano que la actividad es un deporte
	public ActividadSemanal laDeMenorCostoPara(ActividadSemanal acti) {
		return actividades.stream().filter(act -> act == acti).min(Comparator.comparing(acti.getCosto()));
	}
}
