package tp12_StateYStrategy;

public class VideoJuegoUnJugador extends VideoJuego {

	public VideoJuegoUnJugador(int ranura, String controles) {
		super(ranura, controles);
	}

	@Override
	public void controlar(int fichas) {
		if(fichas == 1) {
			ranura = ranura - fichas;
		}
		this.apretarInicio();
	}

	@Override
	public void apretarInicio() {
	
		ranura = 0;
	}
}
