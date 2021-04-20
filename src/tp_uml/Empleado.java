package tp_uml;

import java.util.*;
import java.util.Date;

public abstract class Empleado {

		private String nombre;
		private String direccion;
		private String estadoCivil;
		private Date fechaNac;
		private Float sueldoBasico;
		
		public String getNombre() { 
			return nombre;
		}
		
		public void setNombre(String nuevoNombre) {
			nombre = nuevoNombre;
		}
		
		public String getDireccion() {
			return direccion;
		}
		
		public void setDireccion(String nuevaDire) {
			direccion = nuevaDire;
		}
		
		public String getEstadoCivil() {
			return estadoCivil;
		}
		
		public void setEstadoCivil(String nuevoEstadoCivil) {
			estadoCivil = nuevoEstadoCivil;
		}
		
		public Date getFechaNac() {
			return fechaNac;
		}
		
		public Float getSueldoBasico() {
			return sueldoBasico;
		}
		
		public Float calculoDeSueldoBruto(); //falta codear
		public Float calculoSueldoNeto();    //falta codear
		public Float retencionesAplicadas(); //falta codear
}
