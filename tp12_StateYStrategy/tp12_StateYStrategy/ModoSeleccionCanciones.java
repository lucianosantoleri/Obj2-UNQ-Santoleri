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
		this.setReproduciendo(false);
	}

	@Override
	public void stop() {
		this.pause();
		this.cambiarModo();
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
	
	public Song cambiarModo() {
		Song modoSeleccion = new ModoInicio(cancion);
		if(super.modo.equals(modoSeleccion)) 
		{
			super.modo = this;
		}
		return this;
	}
}
