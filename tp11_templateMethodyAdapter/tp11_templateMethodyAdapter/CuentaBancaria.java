package tp11_templateMethodyAdapter;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {

	private String titular;
	private int saldo;
	private List<String> movimientos;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}
	
	public String getTitular() {
		return titular;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void setSaldo(int monto) {
		this.saldo = monto;
	}
	
	public void agregarMovimiento(String movimiento) {
		movimientos.add(movimiento);
	}
	
	
	//metodo corregido: asi deberia quedar para que sea un template method
	public void extraer(int monto) {
			this.accionDeExtraccionCompleta(monto);
    }
	
	//separamos el metodo extraer para facilitar el template method
	public void accionDeExtraccionCompleta(int monto) {
		this.setSaldo(this.getSaldo()-monto);
		this.agregarMovimiento("Extraccion");
	} 
	/*Termino teniendo getters y setters (operaciones primitivas) necesarios. Ademas el temmplate method,
	 * aplicado en el metodo extraer*/
}
