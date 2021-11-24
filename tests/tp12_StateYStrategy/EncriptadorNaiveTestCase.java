package tp12_StateYStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EncriptadorNaiveTestCase {

	private EncriptadorNaive encriptador;
	private String texto;
	
	@BeforeEach
	public void setUp() {
		
		//sut
		encriptador = new EncriptadorCambioVocal();
		texto = "hola";
	}
	
	@Test
	public void testEncriptandoConVocales() {
		
		assertEquals(encriptador.encriptar(texto), "hule");
	}
}
