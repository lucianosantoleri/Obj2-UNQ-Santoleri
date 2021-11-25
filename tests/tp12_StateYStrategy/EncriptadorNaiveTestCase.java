package tp12_StateYStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EncriptadorNaiveTestCase {

	private EncriptadorNaive encriptador;
	private EncriptadorNaive encriptador2;
	public String texto;
	public String encriptado;
	
	@BeforeEach
	public void setUp() {
		
		//sut
		encriptador = new EncriptadorCambioVocal();
		encriptador2 = new EncriptadorLetraPorNumero();
		texto = "hola";
		encriptado = "hule";
	}
	
	@Test
	public void testEncriptandoConVocales() {
		
		texto = encriptador.encriptar(texto);
		
		assertEquals(texto, "hule");
	}
	
	@Test
	public void testEncriptandoConNumeros() {
		
		texto = encriptador2.encriptar(texto);
		
		assertEquals(texto, "h4l1");
	}
	
	@Test
	public void testDesencriptandoConVocales() {
		
		encriptado = encriptador.desencriptar(texto);
		
		assertEquals(texto, "hola");
	}
	
	@Test
	public void testDesencriptandoConNumeros() {
		
		texto = "h4l1";
		encriptado = encriptador2.desencriptar(texto);
		
		assertEquals(texto, "hola");
	}
}
