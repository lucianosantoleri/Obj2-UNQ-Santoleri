package tp3_introAjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// PUNTO 1 - CONTADOR

public class Counter {

	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public static int numero;
	public static Integer numeroInteger;
	
	public Boolean esPar(Integer numero2) {
		return (numero2%2 == 0);
	}
	
	public Boolean esImpar(Integer numero2) {
		return (numero2%2 != 0);
	}
	
	public List<Integer> soloPares() {
		return numeros.stream().filter(numero -> esPar(numero)).collect(Collectors.toList());
	}
	
	public List<Integer> soloImpares() {
		return numeros.stream().filter(numero -> esImpar(numero)).collect(Collectors.toList());
	}
	
	public int cantidadDePares() {
		return soloPares().size();
	}
	
	public int cantidadImpares() {
		return soloImpares().size();
	}

	public void addNumber(Integer i) {
		numeros.add(i);
	}

	public Double getEvenOcurrences() {
		return (double) soloImpares().size();
	}
	
	public int cantidadDeMultiplosDe(int multiplo){
		int total = 0;
		for( int i = 0; i < numero; i = i + multiplo ) {
	        total = total + i;
		}
		return total;
	}
}

/* PUNTO 5 - EXAMINAR EXPRESIONES
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
 * PUNTO 6 - TIPOS PRIMITIVOS
 * 
 * 
 * 1)- Se llama tipo primitivo o tipo elemental a los tipos de datos originales de un lenguaje de programación, 
 * esto es, aquellos que nos proporciona el lenguaje y con los que podemos (en ocasiones) construir tipos de 
 * datos abstractos y estructuras de datos.
 * 
 * 2)- La clase Integer envuelve el tipo primitivo int en un objeto. Un objeto de tipo Integer 
 * contiene un solo campo cuyo valor es de tipo int.
 * 
 * 3)- la variable de instancia de tipo int retorna 0 si no se le asigna ningun valor, la variable de instancia
 * de la clase de tipo Integer retorna null porque Integer no es un tipo primitivo.
 * 
 * 4)- la variable de metodo seria con los mismos retornos que punto anterior.
 * */
