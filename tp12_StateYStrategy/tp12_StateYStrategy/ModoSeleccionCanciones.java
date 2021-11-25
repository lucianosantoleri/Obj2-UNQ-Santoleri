package tp12_StateYStrategy;

public class ModoSeleccionCanciones extends Song {
	
	public ModoSeleccionCanciones(String cancion) {
		super(cancion);
	}

	@Override
	public void play() {
		super.setReproduciendo(true);
	}

	@Override
	public void pause() {
		if(super.getReproduciendo() == true) {
			super.setReproduciendo(false);
		}
	}

	@Override
	public void stop() {
		this.pause();
		super.cambiarAModoSeleccion();
	}
}
