package tp3_introAjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// PUNTO 4 - MULTIOPERADOR

public class Multioperador {

	
	private ArrayList<Integer> enteros = new ArrayList<Integer>();
	
	public int sumar() {
		int total = 0;
		for (int i = 0;i < enteros.size();i++){
			total = total + i;
		}
		return total;
	}
	
	public int restar() {
		int total = this.sumar();
		for (int i = 0;0 < enteros.size();i++){
			total = total - i;
		}
		return total;
	}
	
	public int multiplicar() {
		int total = 0;
		for (int i = 0;i < enteros.size();i++){
			total = total * i;
		}
		return total;
	}
	
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


/*
 * PUNTO 5 - SISTEMA DE PAQUETES
 * 
 * 1) En mi sistema de archivos, los paquetes estarian organizados en paquete Model, luego en sub-source folder de model.gui y model.stack
 * 2) La relacion es que los archivos se encuentran en misma ubicacion los de mismo nombre. 
 *
 * 
 * */
