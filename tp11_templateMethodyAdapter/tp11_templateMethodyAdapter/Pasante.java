package tp11_templateMethodyAdapter;

public class Pasante extends Empleado {

	public Pasante(int horas, int hijos) {
		super.hijos = hijos;
		super.horasTrabajo = horas;
	}
	
	@Override
	public int sueldoBasico() {
		return 40 * super.horasTrabajo;
	}
	
	@Override
	public int sueldo() {
		return this.sueldoBasico();
	}
}
