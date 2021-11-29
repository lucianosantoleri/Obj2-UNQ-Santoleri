package tp10_observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Servidor extends Observable implements Observer {
    private List<String> nombreDeDeportesInteresantes;
    private List<Partido> partidos;

    public Servidor(List<String> nombreDeDeportesInteresantes) {
        this.nombreDeDeportesInteresantes = nombreDeDeportesInteresantes;
        this.partidos = new ArrayList<>();
    }

    @Override
    public void update(Observable o, Object arg) {
        Partido partido = (Partido) arg;
        if(nombreDeDeportesInteresantes.size()>0 ||nombreDeDeportesInteresantes.contains(partido.getDeporte())){
            setPartido(partido);
        }
    }

    public void setPartido(Partido partido) {
        setChanged();
        notifyObservers(partido);
        this.partidos.add(partido);
    }
}