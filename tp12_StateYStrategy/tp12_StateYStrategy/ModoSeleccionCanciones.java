package tp12_StateYStrategy;

public class ModoSeleccionCanciones extends Song {

	private Boolean reproduciendo = false;
	
	public ModoSeleccionCanciones(String cancion) {
		super(cancion);
	}

	@Override
	public void play() {
		this.setReproduciendo(true);
	}

	@Override
	public void pause() {
		if(this.getReproduciendo() == true) {
		this.setReproduciendo(false);
		}
	}

	@Override
	public void stop() {
		this.pause();
		super.cambiarAModoSeleccion();
	}

	public Boolean getReproduciendo() {
		return reproduciendo;
	}

	public void setReproduciendo(Boolean reproduciendo) {
		this.reproduciendo = reproduciendo;
	}

	@Override
	public Song modo() {
		
		return this;
	}
}
