package tp10_observer;

import java.util.Set;

public interface IJugador {

	void recibirPreguntas(IJuego juego, Set<String> preguntas);

	void actualizarEstadoDeJuego(IJuego juego);

	void accionNoPermitida(); //este m�todo deber�a imprimir en consola

	void recibirNotificacionRC();

	String getNombre();

	void recibirNotificacionJugadorRC(String nombreJugador, String pregunta);

	void recibirNotificacionRInc();

	void recibirNotificacionGanador(String nombre);

}