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
	
	public ActividadSemanal laDeMenorCostoPara(ActividadSemanal depo) {
		List<ActividadSemanal> actis = actividades.stream().
												  filter(act -> act == depo).collect(Collectors.toList());
		int costo = depo.getCosto();
		return actis.stream().min(Comparator.comparing(ActividadSemanal::costo)).get();
	}
}
