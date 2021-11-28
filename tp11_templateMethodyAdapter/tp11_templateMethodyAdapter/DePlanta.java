package tp11_templateMethodyAdapter;

public class DePlanta extends Empleado {

	@Override
	public int sueldoBasico() {
		return 3000;
	}

	@Override
	public int sueldo() {
		return (this.sueldoBasico() + this.plusPorHijo()) - this.descuentoAporteYObraSocial();
	}

	private int plusPorHijo() {
		return super.hijos * 150;
	}
	
	private int descuentoAporteYObraSocial() {
		return (int) (this.sueldoBasico() * 0.13);
	}
}
