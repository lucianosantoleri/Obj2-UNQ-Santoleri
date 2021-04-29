package tp3_introAjava;

import java.util.*;
import java.text.SimpleDateFormat;

//Encapsulamiento

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}	
}

/* 1)- Si un objeto cualquier pide la edad no tiene forma de saber como se calcula porque se respeta el encapsulamiento.
 * */
