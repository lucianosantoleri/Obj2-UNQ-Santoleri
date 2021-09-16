package tp4_POOenJava;

import java.time.LocalDate;
import java.util.*;

public class Persona implements SerVivo {

	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, int edad, LocalDate fechaNac) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNac;
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
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public Boolean mayorQue(Persona nuevaPersona) {
		return this.edad> nuevaPersona.edad;
	}
	
	public Boolean menorQue(Persona nuevaPersona) {
		return this.edad<nuevaPersona.edad;
	}

	@Override
	public String suNombre(String nombre) {
		// TODO Auto-generated method stub
		return nombre;
	}
}
