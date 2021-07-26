package tp_uml;

import java.util.*;
import java.time.*;

public class EmpPlantaTemporaria extends Empleado {

	
		private Date fechaDesignacionAPlantaTemp;
		private int cantidadHorasExtras;
	
	
		public EmpPlantaTemporaria(String nombre, String direccion, String estadoCivil, 
				                   Date fechaNac, Float sueldoBasico, Date fechaDesignacion,
				                   int cantHorasExtras) {
			
			super(nombre,direccion,estadoCivil,fechaNac,sueldoBasico);
			fechaDesignacionAPlantaTemp = fechaDesignacion;
			cantidadHorasExtras = cantHorasExtras;
		}
		
		@Override
		public Float calculoDeSueldoBruto() {
			return super.getSueldoBasico() + cantidadHorasExtras*40;
		}
		
		@Override
		public Float retencionesAplicadas() {
			return this.retencionObraSocial() + 25 + this.superaCincuentaAniosDeAporte();
		}
		
		@Override
		public Float retencionObraSocial() {
			Float calculo;
			calculo = this.calculoDeSueldoBruto();
			return (calculo*10)/100;
		}
		
		public Float superaCincuentaAniosDeAporte() {
			return this.retencionObraSocial() + cantidadHorasExtras*5;
		}
}



