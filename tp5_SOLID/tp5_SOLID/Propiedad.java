package tp5_SOLID;

public class Propiedad {

	private String descripcion;
	private String direccion;
	private int valorFiscal;
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getValorFiscal() {
		return valorFiscal;
	}
	
	public void setValorFiscal(int valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
}
