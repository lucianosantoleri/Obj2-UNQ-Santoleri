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
}
