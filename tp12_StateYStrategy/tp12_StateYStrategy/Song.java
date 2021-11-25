package tp12_StateYStrategy;

public abstract class Song implements IReproductorMP3{

	protected String cancion;
	protected Song modo;
	
	public Song(String cancion) {
		this.cancion = cancion;
	}
	
	@Override
	public abstract void play();

	@Override
	public abstract void pause();

	@Override
	public abstract void stop();
	
	@Override
	public abstract Song modo();
	
	public Song cambiarAModoSeleccion() {
		Song modoInicio = new ModoInicio(cancion);
		Song modoSeleccion = new ModoSeleccionCanciones(cancion);
		if(modo.equals(modoInicio)) 
		{
			modo = modoSeleccion;
		}
		return modo;
	}
	
	public Song cambiarAModoInicio() {
		Song modoInicio = new ModoInicio(cancion);
		Song modoSeleccion = new ModoSeleccionCanciones(cancion);
		if(modo.equals(modoSeleccion)) 
		{
			modo = modoInicio;
		}
		return modo;
	}
}
