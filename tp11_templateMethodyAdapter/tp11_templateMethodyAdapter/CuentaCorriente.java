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
			super.accionDeExtraccionCompleta(monto); //a traves de este template method ahorramos reescribir el codigo
		}
	}

	public int getDescubierto() {
		return descubierto;
	}
}
