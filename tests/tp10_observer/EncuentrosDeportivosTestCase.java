package tp10_observer;

import tp10_observer.Servidor;
import tp10_observer.Partido;
import tp10_observer.EncuentrosDeportivos;
import tp10_observer.AppMovil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class EncuentrosDeportivosTest {

    private EncuentrosDeportivos encuentrosDeportivos;
    private Partido partido1,partido2,partido3,partido4,partido5;
    private Servidor servidor1,servidor2,servidor3;
    private AppMovil appMovil1,appMovil2,appMovil3,appMovil4,appMovil5;

    @SuppressWarnings("deprecation")
	@BeforeEach
    void setUp() {

        encuentrosDeportivos = new EncuentrosDeportivos();

        servidor1 = new Servidor(new ArrayList<>(List.of("Futbol")));
        servidor2 = new Servidor(new ArrayList<>(List.of("Futbol","Boxeo")));
        servidor3 = new Servidor(new ArrayList<>(List.of("Tennis","Basquet","Boxeo")));

        encuentrosDeportivos.addObserver(servidor1);
        encuentrosDeportivos.addObserver(servidor2);
        encuentrosDeportivos.addObserver(servidor3);
//ombreDeportesInteresantes, List<String> nombreDeContrincantesInteresantes)
        appMovil1 = new AppMovil(new ArrayList<>(List.of("Futbol")),new ArrayList<>(List.of("Messi")));
        appMovil2 = new AppMovil(new ArrayList<>(List.of("Futbol")),new ArrayList<>(List.of("jugadorDeFutbol1","jugadorDeFutbol2")));
        appMovil3 = new AppMovil(new ArrayList<>(List.of("Tennis")),new ArrayList<>(List.of("jugadorDeTennis1")));
        appMovil4 = new AppMovil(new ArrayList<>(List.of("Futbol")),new ArrayList<>(List.of("El Bicho")));
        appMovil5 = new AppMovil(new ArrayList<>(List.of("Futbol","Boxeo")),new ArrayList<>(List.of("Messi","Micke Tyson")));

        servidor1.addObserver(appMovil1);
        servidor1.addObserver(appMovil2);
        servidor1.addObserver(appMovil4);
        servidor2.addObserver(appMovil5);
        servidor3.addObserver(appMovil3);
        //public Partido(String resultado, List<String> contrincantes, String deporte
        //new ArrayList<>(List.of("Amarillo", "SSR")
        partido1 = new Partido("Gano",new ArrayList<>(List.of("Neymar,Messi,Mbappe")),"Futbol");
        partido2 = new Partido("Perdio",new ArrayList<>(List.of("jugadorDeTennis1","jugadorDeTennis2","jugadorDeTennis3")),"Tennis");
        partido3 = new Partido("Perdio",new ArrayList<>(List.of("jugadorDeBasquet1","jugadorDeBasquet2","jugadorDeBasquet3")),"Basquet");
        partido4 = new Partido("Gano",new ArrayList<>(List.of("jugadorDeFutbol1","jugadorDeFutbol2","jugadorDeFutbol3")),"Futbol");
        partido5 = new Partido("Perdio",new ArrayList<>(List.of("Micke Tyson")),"Boxeo");

    }
    @Test
    void algunawea(){

        encuentrosDeportivos.setPartido(partido1);
        assertTrue("El equipo de Neymar,Messi,Mbappe jugo Futbol y Gano.\n".equals(appMovil1.getNotificaciones()));
        assertTrue("".equals(appMovil2.getNotificaciones()));
        assertTrue("".equals(appMovil3.getNotificaciones()));
        assertTrue("".equals(appMovil4.getNotificaciones()));
        assertTrue("El equipo de Neymar,Messi,Mbappe jugo Futbol y Gano.\n".equals(appMovil5.getNotificaciones()));

        encuentrosDeportivos.setPartido(partido2);
        assertTrue("El equipo de Neymar,Messi,Mbappe jugo Futbol y Gano.\n".equals(appMovil1.getNotificaciones()));
        assertTrue("".equals(appMovil2.getNotificaciones()));
        assertTrue("El equipo de jugadorDeTennis1, jugadorDeTennis2, jugadorDeTennis3 jugo Tennis y Perdio.\n".equals(appMovil3.getNotificaciones()));

        assertTrue("".equals(appMovil4.getNotificaciones()));
        assertTrue("El equipo de Neymar,Messi,Mbappe jugo Futbol y Gano.\n".equals(appMovil5.getNotificaciones()));
        //A nadie le intereso el basquet
        encuentrosDeportivos.setPartido(partido3);
        assertTrue("El equipo de Neymar,Messi,Mbappe jugo Futbol y Gano.\n".equals(appMovil1.getNotificaciones()));
        assertTrue("".equals(appMovil2.getNotificaciones()));
        assertTrue("El equipo de jugadorDeTennis1, jugadorDeTennis2, jugadorDeTennis3 jugo Tennis y Perdio.\n".equals(appMovil3.getNotificaciones()));
        assertTrue("".equals(appMovil4.getNotificaciones()));
        assertTrue("El equipo de Neymar,Messi,Mbappe jugo Futbol y Gano.\n".equals(appMovil5.getNotificaciones()));
        //A nadie le intereso el basquet
        encuentrosDeportivos.setPartido(partido4);
        assertTrue("El equipo de Neymar,Messi,Mbappe jugo Futbol y Gano.\n".equals(appMovil1.getNotificaciones()));
        assertTrue("El equipo de jugadorDeFutbol1, jugadorDeFutbol2, jugadorDeFutbol3 jugo Futbol y Gano.\n".equals(appMovil2.getNotificaciones()));
        assertTrue("El equipo de jugadorDeTennis1, jugadorDeTennis2, jugadorDeTennis3 jugo Tennis y Perdio.\n".equals(appMovil3.getNotificaciones()));
        assertTrue("".equals(appMovil4.getNotificaciones()));
        assertTrue("El equipo de Neymar,Messi,Mbappe jugo Futbol y Gano.\n".equals(appMovil5.getNotificaciones()));

        encuentrosDeportivos.setPartido(partido5);
        assertTrue("El equipo de Neymar,Messi,Mbappe jugo Futbol y Gano.\n".equals(appMovil1.getNotificaciones()));
        assertTrue("El equipo de jugadorDeFutbol1, jugadorDeFutbol2, jugadorDeFutbol3 jugo Futbol y Gano.\n".equals(appMovil2.getNotificaciones()));
        assertTrue("El equipo de jugadorDeTennis1, jugadorDeTennis2, jugadorDeTennis3 jugo Tennis y Perdio.\n".equals(appMovil3.getNotificaciones()));
        assertTrue("".equals(appMovil4.getNotificaciones()));

        assertTrue(("El equipo de Neymar,Messi,Mbappe jugo Futbol y Gano.\n" +
                "El equipo de Micke Tyson jugo Boxeo y Perdio.\n").equals(appMovil5.getNotificaciones()));

     }
}