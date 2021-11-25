package tp12_StateYStrategy;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VideoJuegoTestCase {

	private VideoJuego unJugador;
	private VideoJuego dosJugadores;
	public String controles;
	public int fichas;
	
	@BeforeEach
	public void setUp() {
		
		//sut
		unJugador = new VideoJuegoUnJugador(2, controles);
		dosJugadores = new VideoJuegoDosJugadores(2, controles);
		controles = "Arriba,Abajo,Izquierda,Derecha";
		fichas = 3;
	}
	
	@Test
	public void testUnJugador() {
		
		unJugador.controlar(1);
		assertEquals(unJugador.ranura, 0);
	}
	
	@Test
	public void testDosJugadores() {
		
		dosJugadores.controlar(2);
		assertEquals(unJugador.ranura, 2);
	}
}
