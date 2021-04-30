package tp3_introAjava;

import java.util.*;
import tp3_introAjava.Persona;

public class EquipoDeTrabajo {

	private String nombre;
	private ArrayList<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}

	public void addIntegrante(Persona integrante) {
		integrantes.add(integrante);
	}
	
	public void removeIntegrante(Persona integrante) {
		integrantes.remove(integrante);
	}
	
	public int promedioEdadIntegrantes() {
		return this.integrantes.stream().mapToInt(integrante -> integrante.getEdad()).sum()/integrantes.size();
	}
}
