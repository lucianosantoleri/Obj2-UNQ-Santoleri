package tp_numsYstreams;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
	
	public ActividadSemanal laDeMenorCostoPara(DEPORTE depo) {
		List<ActividadSemanal> actis = actividades.stream().
												  filter(act -> act.getDeporte() == depo).collect(Collectors.toList());
		
		return actis.stream().min(Comparator.comparing(ActividadSemanal::getCosto)).get();
	}
	
	public Map<DEPORTE,ActividadSemanal> laActividadMasEconomica(){
        //Lista con Opcional
        Map<DEPORTE,Optional<ActividadSemanal>> loQueTenemos =
        this.actividades.stream()
                .collect(Collectors.groupingBy(ActividadSemanal::getDeporte
                        ,(Collectors.minBy(Comparator.comparing(ActividadSemanal::getCosto)))));
        //Creamos una lista sin Opcional
        Map <DEPORTE,ActividadSemanal> loQueQueremos = new HashMap<DEPORTE,ActividadSemanal>();
        //Recorremos el map de Opcional y guadamos los datos en el map loQueQueremos la actividadSemanal sin Opcional
        loQueTenemos.forEach((deporte, actividadSemanal) -> loQueQueremos.put(deporte,actividadSemanal.get()));
        
        return loQueQueremos;
    }
	
	/*
	public void imprimirActividades() {
		List<ActividadSemanal> actis = actividades.stream().
				  filter(act -> act.getDeporte()).collect(Collectors.toList());
		
		System.out.println(Arrays.toString(actis));
	}
	*/
}
