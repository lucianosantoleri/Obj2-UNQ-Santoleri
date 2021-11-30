package tp12_StateYStrategy;

public abstract class EstrategiaEncriptado {

	public String encriptar(String texto){
		/*
		 * Este m�todo funciona como un template. La estructura es la misma para todas las subclases, pero estas est�n obligadas
		 * a implementar a su manera el m�todo condificar
		 */
		char[] arregloDeLetras = texto.toCharArray();
		String resultado = "";
		for (char letra : arregloDeLetras) {
			resultado = resultado + this.codificar(letra);
		}
		return resultado;
	}

	// Operaci�n primitiva
	public abstract String desencriptar(String texto);
	
	// Hook Method
	protected abstract String codificar(char letra);
	
}