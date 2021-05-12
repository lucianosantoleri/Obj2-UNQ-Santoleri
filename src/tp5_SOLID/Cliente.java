package tp5_SOLID;

public class Cliente {

	private String nombre;
	private String apellido;
	private Float edad;
	private String direccion;
	private Float sueldoNetoMensual;
	
	public Float getEdad() {
		return edad;
	}
	
	public void setEdad(Float edad) {
		this.edad = edad;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Float getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public void setSueldoNetoMensual(Float sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public Float sueldoNetoAnual() {
		return null; //codificar
	}
	
	public void solicitarCredito(Banco banco) {
		
	}
}
