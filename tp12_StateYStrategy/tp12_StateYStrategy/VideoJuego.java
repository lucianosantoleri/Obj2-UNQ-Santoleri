package tp12_StateYStrategy;

public abstract class VideoJuego implements IMaquinaVideoJuego {

	protected int ranura = 2;
	protected String controles;
	
	public VideoJuego(int ranura, String controles) {
		this.ranura = ranura;
		this.controles = controles;
	}
	
	public abstract void controlar(int fichas);
	
	public abstract void apretarInicio();
}
