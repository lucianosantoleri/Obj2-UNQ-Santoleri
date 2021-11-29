package tp10_observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class SistemaDeReferencias extends Observable {

    private List<Articulo> articulos;

    public SistemaDeReferencias() {
        this.articulos = new ArrayList<>();
    }

    public void agregarArticulo(Articulo articulo) {
        setChanged();
        notifyObservers(articulo.getPalabrasClaves());
        this.articulos.add(articulo);
    }
}