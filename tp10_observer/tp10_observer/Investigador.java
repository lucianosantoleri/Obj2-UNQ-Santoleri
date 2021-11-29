package tp10_observer;

import java.util.*;

@SuppressWarnings("deprecation")
public class Investigador extends  Persona implements Observer {
    private List<String> temasDeInvestigacion;
    private String notificaciones;

    public Investigador(String nombe, List<String> temasDeInvestigacion) {
        super(nombe);
        this.temasDeInvestigacion = temasDeInvestigacion;
        this.notificaciones ="";
    }

    @Override
    public void update(Observable o, Object arg) {
        String palabrasClaves = (String) arg;
        this.temasDeInvestigacion.stream().forEach(
                tema -> imprimirSiMeInteresa(tema, palabrasClaves)
        );
    }

    public String getNotificaciones() {
        return notificaciones;
    }

    private void imprimirSiMeInteresa(String tema, String palabrasClaves) {
        if (palabrasClaves.contains(tema)) {
            this.notificaciones += "Notificacion: El Sistema de Referencias esta publicando un Articulo que habla de "+tema+".\n";
        }
    }
}