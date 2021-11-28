package tp11_templateMethodyAdapter;

public class CuentaCorriente extends CuentaBancaria{

	private int descubierto;
	
	public CuentaCorriente(String titular, int descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}

	@Override
	public void extraer(int monto) {
		if(this.getSaldo()+this.getDescubierto()>=monto) {
			this.setSaldo(this.getSaldo()-monto);
			this.agregarMovimiento("Extraccion");
		}
	}

	public int getDescubierto() {
		return descubierto;
	}
}
