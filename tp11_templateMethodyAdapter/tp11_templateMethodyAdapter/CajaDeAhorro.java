package tp11_templateMethodyAdapter;

public class CajaDeAhorro extends CuentaBancaria{

	private int limite;
	
	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite = limite;
	}

	@Override
	public void extraer(int monto) {
		if(this.getSaldo()>= monto && this.getLimite()>=monto) {
			super.accionDeExtraccionCompleta(monto); //a traves de este template method ahorramos reescribir el codigo
		}
	}
	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	
}
