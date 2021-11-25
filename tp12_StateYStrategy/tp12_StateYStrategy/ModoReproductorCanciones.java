package tp12_StateYStrategy;

public class ModoReproductorCanciones extends Song {

	private Boolean reproduciendo = false;
	
	public ModoReproductorCanciones(String cancion) {
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
		Song modoSeleccion = new ModoSeleccionCanciones(cancion);
		if(super.modo.equals(modoSeleccion)) 
		{
			super.modo = this;
		}
		return this;
	}
}
