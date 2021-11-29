package tp10_observer;

import tp10_observer.PorTitulo;
import tp10_observer.Notificador;
import tp10_observer.SistemaDeReferencias;
import tp10_observer.ISuscriptor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class SistemaDeReferenciasTest {

    private SistemaDeReferencias sistemaDeReferencias;
    private Articulo articulo1,articulo2;
    private Autor autor1,autor2,autor3;
    private Investigador investigador1,investigador2,investigador3;

    @SuppressWarnings("deprecation")
	@BeforeEach
    void setUp() {

        sistemaDeReferencias = new SistemaDeReferencias();
        investigador1 = new Investigador("Invesigador1",new ArrayList<>(List.of("Amarillo", "SSR")));
        investigador2 = new Investigador("Invesigador2",new ArrayList<>(List.of("Spring Boot")));
        investigador3 = new Investigador("Invesigador3",new ArrayList<>(List.of("Amarillo")));

        sistemaDeReferencias.addObserver(investigador1);
        sistemaDeReferencias.addObserver(investigador2);
        sistemaDeReferencias.addObserver(investigador3);

        articulo1 = new Articulo("Spring Boot Persistence Best Practices ","Informes","","Spring Boot Aprendizaje Experto SSR");
        autor1 = new Autor("Anghel Leonard");
        articulo1.setAutor(autor1);

        articulo2 = new Articulo("Un Cuento Aburrido","Informe Breve","","Aburrido Rojo Verde Amarillo");
        autor2 = new Autor("Un Buen Autor1");
        autor3 = new Autor("Un Buen Autor2");
        articulo2.setAutor(autor2);
        articulo2.setAutor(autor3);

    }
    @Test
    void agregarArticuloYNotificarALosObservers(){
        //Agregamos un articulo y notificamos a cada investigador
        sistemaDeReferencias.agregarArticulo(articulo2);

        assertTrue("Notificacion: El Sistema de Referencias esta publicando un Articulo que habla de Amarillo.\n"
                .equals(investigador1.getNotificaciones()));

        assertTrue("".equals(investigador2.getNotificaciones()));

        assertTrue("Notificacion: El Sistema de Referencias esta publicando un Articulo que habla de Amarillo.\n"
                .equals(investigador3.getNotificaciones()));
        //Agregamos otro articulo y notifcamos de nuevo
        sistemaDeReferencias.agregarArticulo(articulo1);

        assertTrue(
                ("Notificacion: El Sistema de Referencias esta publicando un Articulo que habla de Amarillo.\n" +
                        "Notificacion: El Sistema de Referencias esta publicando un Articulo que habla de SSR.\n").equals(investigador1.getNotificaciones()));

        assertTrue("Notificacion: El Sistema de Referencias esta publicando un Articulo que habla de Spring Boot.\n"
                .equals(investigador2.getNotificaciones()));

        assertTrue("Notificacion: El Sistema de Referencias esta publicando un Articulo que habla de Amarillo.\n"
                .equals(investigador3.getNotificaciones()));

    }

}