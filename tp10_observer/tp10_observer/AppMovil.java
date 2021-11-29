package tp10_observer;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class AppMovil implements Observer {
    private List<String> nombreDeportesInteresantes;
    private List<String> nombreDeContrincantesInteresantes;
    private String notificaciones;

    public AppMovil(List<String> nombreDeportesInteresantes, List<String> nombreDeContrincantesInteresantes) {
        this.nombreDeportesInteresantes = nombreDeportesInteresantes;
        this.nombreDeContrincantesInteresantes = nombreDeContrincantesInteresantes;
        this.notificaciones = "";
    }


    @Override
    public void update(Observable o, Object arg) {
        Partido partido = (Partido) arg;
        String listToString = partido.getContrincantes().toString();
        //El partido debe tener los contrincates que le interesan y el deporte que le interesa. sino no le veo funcionalidad
        //a los nombresde contrincantes que le interesa

        if(this.nombreDeContrincantesInteresantes.stream().anyMatch(nombre -> listToString.contains(nombre))
                && nombreDeportesInteresantes.contains(partido.getDeporte())){
            this.notificaciones += "El equipo de "+listToString.replace("[", "")
                    .replace("]", "")+" jugo "+partido.getDeporte()+" y "+partido.getResultado()+".\n";
        }
    }

    public String getNotificaciones() {
        return this.notificaciones;
    }
}