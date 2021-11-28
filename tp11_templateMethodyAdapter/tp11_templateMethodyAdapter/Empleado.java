package tp11_templateMethodyAdapter;

public abstract class Empleado {

	protected int horasTrabajo;
	protected int hijos;
	
	public int sueldo() {
		return this.sueldoBasico();
	}
	
	public abstract int sueldoBasico();

	protected int pagoPorFamilia() {
		return 0;
	}
}
