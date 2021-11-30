package tp12_StateYStrategy;

import java.util.HashMap;
import java.util.Map;

public class IntercambioNumerico extends EstrategiaEncriptado {
	
	private static IntercambioNumerico instance;
	private Map<String, String> memoria;
	private String codigo;
	
	/*
	 * siempre que se quiera crear una instancia de IntercambioVocal, debe llamarse al m�todo est�tico getInstance() para evaluar retornar una
	 *  nueva instancia de la clase o si ya hay una, devolver esta (respeta el patr�n Singleton para que exista una �nica instancia en el sistema).
	 *  Esto es para que al crear un nuevo IntercambioNumerico la memoria no se resetee, y asi permitir desencriptar la frase anteriormente
	 *  convertida a n�meros
	 */
	
	public static EstrategiaEncriptado getInstance() {
		if (instance == null) {
			instance = new IntercambioNumerico();
		}
		return instance;
	}
	
	private IntercambioNumerico() {
		this.memoria = new HashMap<String, String>();
		this.codigo = " abcdefghijklmnopqrstuvwxyz";
	}

	@Override
	public String encriptar(String texto) {
		String resultado = super.encriptar(texto);
		this.memoria.put(resultado, texto);
		return resultado;
	}

	@Override
	public String desencriptar(String texto) {
		String resultado = this.memoria.get(texto);
		this.memoria.remove(texto);
		return resultado;
	}
	
	@Override
	protected String codificar(char letra) {
		return String.valueOf(this.codigo.indexOf(letra));	
	}

}