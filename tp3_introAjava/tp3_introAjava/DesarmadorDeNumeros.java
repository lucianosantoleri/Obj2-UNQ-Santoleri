package tp3_introAjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DesarmadorDeNumeros {

	
	private ArrayList<Integer> numeros = new ArrayList<Integer>();

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public Integer cantidadDigitosPares(ArrayList<Integer> numeros) {
		
		int numeroMayorConPares = 0;
		
		for(int i=0; i<numeros.size(); i++) {
			if(i%2 == 0) {
				numeroMayorConPares = numeroMayorConPares + 1;
			}
		}
		
		return numeroMayorConPares;
	}
	
	public Integer cantidadDigitosPares(Integer numeros) {
		return cantidadDePares();
	}
	
	public Boolean esPar(Integer numero2) {
		return (numero2%2 == 0);
	}
	
	public List<Integer> soloPares() {
		return numeros.stream().filter(numero -> esPar(numero)).collect(Collectors.toList());
	}
	
	public int cantidadDePares() {
		return soloPares().size();
	}
}