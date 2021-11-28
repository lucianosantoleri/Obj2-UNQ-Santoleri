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
	
	public abstract void extraer(int monto);
}
