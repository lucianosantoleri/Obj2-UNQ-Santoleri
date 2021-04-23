package tp3_introAjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Counter {

	private ArrayList<Double> numeros = new ArrayList<Double>();
	
	public Boolean esPar(Double numero) {
		return (numero%2 == 0);
	}
	
	public Boolean esImpar(Double numero) {
		return (numero%2 != 0);
	}
	
	public List<Double> soloPares() {
		return numeros.stream().filter(numero -> esPar(numero)).collect(Collectors.toList());
	}
	
	public List<Double> soloImpares() {
		return numeros.stream().filter(numero -> esImpar(numero)).collect(Collectors.toList());
	}
	
	public int cantidadDePares() {
		return soloPares().size();
	}
	
	public int cantidadImpares() {
		return soloImpares().size();
	}

	public void addNumber(Double i) {
		numeros.add(i);
	}
}
