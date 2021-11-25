package tp12_StateYStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReproductorMP3TestCase {

	private Song song;
	private Song songDos;
	private String cancion;
	
	
	@BeforeEach
	public void setUp() {
		
		//sut
		song = new ModoSeleccionCanciones(cancion);
		songDos = new ModoInicio(cancion);
		cancion = "Profugos";
	}
	
	@Test
	public void testUnJugador() {
		
		song.play();
		assertEquals(song.getReproduciendo(), true);
	}
}
