package tp_uml;

import java.util.*;
import java.util.Date;

public abstract class Empleado {

		private String nombre;
		private String direccion;
		private String estadoCivil;
		private Date fechaNac;
		private Float sueldoBasico;
		
		public Empleado(String nombre, String direccion, String estadoCivil, Date fechaNac, Float sueldoBasico) {
			this.nombre = nombre;
			this.direccion = direccion;
			this.estadoCivil = estadoCivil;
			this.fechaNac = fechaNac;
			this.sueldoBasico = sueldoBasico;
		}
		
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
		
		public abstract Float calculoDeSueldoBruto();
		
		public Float calculoSueldoNeto() {
			
			return this.calculoDeSueldoBruto() - this.retencionesAplicadas();
		}
		
		public abstract Float retencionesAplicadas();
		
		public abstract Float retencionObraSocial();
}
