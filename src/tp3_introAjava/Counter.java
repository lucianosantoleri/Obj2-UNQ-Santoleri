package tp3_introAjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Counter {

	private ArrayList<Double> numeros = new ArrayList<Double>();
	
	public int numero;
	public Integer numeroInteger;
	
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

	public Double getEvenOcurrences() {
		return (double) soloImpares().size();
	}
}

/* PUNTO 2 - EXAMINAR EXPRESIONES
 * 
 * 
 * s.length -> return 3
 * t.length -> return null
 * 1 + a -> error de tipos
 * a.touppercase -> return "ABC"
 * "Libertad".indexof.("r") -> return "rtad"
 * s == a -> return true
 * 
 * ----------------------------------------------------------------
 * 
 * PUNTO 3 - TIPOS PRIMITIVOS
 * 
 * 
 * 1)- Se llama tipo primitivo o tipo elemental a los tipos de datos originales de un lenguaje de programación, 
 * esto es, aquellos que nos proporciona el lenguaje y con los que podemos (en ocasiones) construir tipos de 
 * datos abstractos y estructuras de datos.
 * 
 * 2)- La clase Integer envuelve el tipo primitivo int en un objeto. Un objeto de tipo Integer 
 * contiene un solo campo cuyo valor es de tipo int.
 * 
 * 3)- 
 * */
