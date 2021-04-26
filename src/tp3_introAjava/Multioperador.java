package tp3_introAjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Multioperador {

	
	private ArrayList<Integer> enteros = new ArrayList<Integer>();
	
	public int sumar() {
		int total = (int) enteros.stream().mapToLong(Integer::longValue).sum();
		return total;
	}
	
	/*public void restar() {
		enteros.stream().mapToLong(Integer::longValue).distinct();
	}
	
	public void multiplicar() {
		enteros.stream().mapToLong(Integer::longValue).count();
	}
	*/
	public void addNumber(Integer i) {
		enteros.add(i);
	}

	public Double getEvenOcurrences() {
		return (double) soloImpares().size();
	}
	
	public List<Integer> soloPares() {
		return enteros.stream().filter(numero -> esPar(numero)).collect(Collectors.toList());
	}
	
	public List<Integer> soloImpares() {
		return enteros.stream().filter(numero -> esImpar(numero)).collect(Collectors.toList());
	}
	
	public int cantidadDePares() {
		return soloPares().size();
	}
	
	public int cantidadImpares() {
		return soloImpares().size();
	}
	
	public Boolean esPar(Integer numero2) {
		return (numero2%2 == 0);
	}
	
	public Boolean esImpar(Integer numero2) {
		return (numero2%2 != 0);
	}
}
