package tp12_StateYStrategy;

public class VideoJuegoDosJugadores extends VideoJuego {

	public VideoJuegoDosJugadores(int ranura, String controles) {
		super(ranura, controles);
	}

	@Override
	public void controlar(int fichas) {
		if(fichas == 2) {
			ranura = ranura - fichas;
		}
		this.apretarInicio();
	}

	@Override
	public void apretarInicio() {	
	}
}
