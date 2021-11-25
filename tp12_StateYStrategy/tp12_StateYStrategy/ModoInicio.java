package tp12_StateYStrategy;

public class ModoInicio extends Song {

	public ModoInicio(String cancion) {
		super(cancion);
	}

	@Override
	public void play() {
		this.retornarError();
	}

	private String retornarError() {
		return "Error: No se encuentra la cancion " + cancion;
	}

	@Override
	public void pause() {
		this.retornarError();
	}

	@Override
	public void stop() {
		this.retornarError();
	}

	@Override
	public Song modo() {
		return this;
	}

}
