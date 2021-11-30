package tp12_StateYStrategy;

public class EncriptadorNaive {
	/*
	 * Delega las peticiones a la instancia de EstrategiaEncriptado que contiene, la cu�l puede elegirse manualmente a trav�s del setter
	 */

	private EstrategiaEncriptado estrategia;

	public String enciptar(String stringOrigen) {
		return this.estrategia.encriptar(stringOrigen);		
	}
	
	public String desencriptar(String stringOrigen) {
		return this.estrategia.desencriptar(stringOrigen);
	}

	public void setEstrategia(EstrategiaEncriptado estrategia) {
		this.estrategia = estrategia;
	}

}