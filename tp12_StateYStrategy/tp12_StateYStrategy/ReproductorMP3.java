package tp12_StateYStrategy;

import tp12_StateYStrategy.Pantalla;

@SuppressWarnings("unused")
public class ReproductorMP3 {
	
	/*
	 * A medida que el sistema de la clase ReproductorMP3 fluye, esta interactua con los distintos EstadoReproductorMP3 de una manera autom�tica.
	 * Dependiendo qu� estado est� activo al momento de recibir una petici�n, el reproductor sabr� contestar de formas diferentes, ya que
	 * le delega el comportamiento.
	 */

	private EstadoReproductorMP3 estado;
	private Pantalla pantalla;
	private Song cancion;

	public ReproductorMP3(Pantalla pantalla) {
		// El reproductor siempre se inicia con una instancia �nica de SeleccionDeCanciones
		this.estado = SeleccionDeCanciones.getInstance();
		this.pantalla = pantalla;
	}
	
	public void setCancionSeleccionada(Song cancionSeleccionada) {
		this.cancion = cancionSeleccionada;
	}

	public Song getCancionSeleccionada() {
		return this.cancion;
	}
	
	public void play() {
		this.estado.play(this);
	}

	void setEstado(EstadoReproductorMP3 estado) {
		this.estado = estado;
	}

	public void pause() {
		this.estado.pause(this);
	}

	public void mostrarMensaje(String mensaje) {
		this.pantalla.mostrar(mensaje);
	}

	public void stop() {
		this.estado.stop(this);
	}

}