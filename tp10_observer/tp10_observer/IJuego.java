package tp10_observer;

public interface IJuego {
	
	void solicitaIngreso(IJugador jugador);
	
	void notificarListoParaJugar();
	
	void notificarJuegoIniciado();
	
	void recibirRespuesta(String pregunta, String respuesta, IJugador jugador);

	void notificarGanadorPartida();
	
	void notificarRCATodos(IJugador jugador, String pregunta);
}