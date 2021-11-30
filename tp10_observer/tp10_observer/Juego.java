package tp10_observer;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Juego implements IJuego{
	/*
	 * Se contempla una única partida en curso
	 * */

	private Set<IJugador> jugadores;
	private IProveedorDeCuestionarios proveedorCuestionarios;
	private Boolean estado;
	private ICuestionario cuestionarioActual;
	private IPuntaje puntajes;
	
	public Juego(IProveedorDeCuestionarios provCuestionarios, IPuntaje puntaje) {
		this.jugadores = new HashSet<IJugador>();
		this.proveedorCuestionarios = provCuestionarios;
		this.estado = false;
		this.puntajes = puntaje;
	}

	@Override
	public void solicitaIngreso(IJugador jugador) {
		if (!this.iniciado() && this.tieneCupo()) {
			this.getJugadores().add(jugador);
		}
	}

	private Boolean tieneCupo() {
		return this.cantidadDeJugadores() < 5;
	}
	

	public Set<IJugador> getJugadores() {
		return this.jugadores;
	}

	private Boolean iniciado() {
		return this.estado;
	}

	private int cantidadDeJugadores() {
		return this.getJugadores().size();
	}

	@Override
	public void notificarListoParaJugar() {
		Set<String> preguntas = this.getPreguntasPartida();
		this.getJugadores().stream().forEach(jugador -> jugador.recibirPreguntas(this, preguntas));
	}

	private Set<String> getPreguntasPartida() {
		return getSiguienteCuestionario().getPreguntas();
	}

	private ICuestionario getSiguienteCuestionario() {
		ICuestionario cuestionario = this.proveedorCuestionarios.getCuestionario();
		this.setCuestionarioActual(cuestionario);
		// por simplicidad solo toma el primero de la lista de cuestionario. Pero debería existir una lógica que tome cuestionarios de manera aleatoria
		return cuestionario;
	}

	void setCuestionarioActual(ICuestionario cuestionario) {
		this.cuestionarioActual	= cuestionario;	
	}

	@Override
	public void notificarJuegoIniciado() {
		this.iniciado(true);
		this.getJugadores().stream().forEach(jugador -> jugador.actualizarEstadoDeJuego(this));
	}

	void iniciado(Boolean estado) {
		this.estado = estado;		
	}

	@Override
	public void recibirRespuesta(String pregunta, String respuesta, IJugador jugador) {
		if (!this.iniciado()) {
			jugador.accionNoPermitida();
		} else {
			this.evaluarRespuesta(pregunta, respuesta, jugador);
		}
	}

	private void evaluarRespuesta(String pregunta, String respuesta, IJugador jugador) {
		if (esRespuestaCorrecta(pregunta, respuesta) && !esUltimaPregunta(pregunta)) {
			procederRC(pregunta, jugador);
		} else if (esRespuestaCorrecta(pregunta, respuesta) && esUltimaPregunta(pregunta)) {
			this.procederRC(pregunta, jugador);
			this.notificarGanadorPartida();
			this.finalizar();
		} else {
			jugador.recibirNotificacionRInc();
		}
		
	}

	private Boolean esUltimaPregunta(String pregunta) {
		return this.cuestionarioActual.esUltimaPregunta(pregunta);
	}

	private Boolean esRespuestaCorrecta(String pregunta, String respuesta) {
		return this.cuestionarioActual.evaluarRespuesta(pregunta, respuesta);
	}

	private void finalizar() {
		this.iniciado(false);	
		this.getPuntajes().clear();
	}

	@Override
	public void notificarGanadorPartida() {
		String nombreGanador = this.cuestionarioActual.getNombreGanador();
		this.getJugadores().stream().forEach(jug -> jug.recibirNotificacionGanador(nombreGanador));
	}

	private void procederRC(String pregunta, IJugador jugador) {
		this.getPuntajes().contabilizarRC(jugador);
		jugador.recibirNotificacionRC();
		this.notificarRCATodos(jugador, pregunta);
	}

	private IPuntaje getPuntajes() {
		return this.puntajes;
	}

	@Override
	public void notificarRCATodos(IJugador jugador, String pregunta) {
		Stream<IJugador> jugadoresNoGanadores = this.getJugadores().stream().filter(jug -> !jug.equals(jugador));
		jugadoresNoGanadores.forEach(jug -> jug.recibirNotificacionJugadorRC(jugador.getNombre(), pregunta));		
	}

	void setJugadores(Set<IJugador> jugadores) {
		this.jugadores = jugadores;		
	}

	void setProveedorCuestionarios(IProveedorDeCuestionarios provCuestionarios) {
		this.proveedorCuestionarios = provCuestionarios;
	}

}