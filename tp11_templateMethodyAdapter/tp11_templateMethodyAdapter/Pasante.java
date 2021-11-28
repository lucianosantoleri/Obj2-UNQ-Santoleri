package tp11_templateMethodyAdapter;

public class Pasante extends Empleado {

	@Override
	public int sueldoBasico() {
		return 40 * super.horasTrabajo;
	}
	
	@Override
	public int sueldo() {
		return this.sueldoBasico();
	}
}
