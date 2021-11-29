package tp10_observer;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class EncuentrosDeportivos extends Observable {
    private List<Partido> partidos;

    public EncuentrosDeportivos() {
        this.partidos = new ArrayList<>();
    }

    public void setPartido(Partido partido) {
        setChanged();
        notifyObservers(partido);
        this.partidos.add(partido);
    }

}