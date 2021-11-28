package tp11_templateMethodyAdapter;

public class Temporario extends Empleado {

	private boolean estaCasado = false;
	
	
	public Temporario(int horas, int hijos) {
		super.hijos = hijos;
		super.horasTrabajo = horas;
	}
	
	@Override
	public int sueldoBasico() {
		return 1000;
	}
	
	@Override
	public int sueldo() {
		return this.sueldoBasico() + this.pagoHorasDeTrabajo() + this.pagoPorFamilia();
	}

	@Override
	public int pagoPorFamilia() {
		if(this.hijosYOCasado()) {
			return 100;
		}
		else {
		return 0;
		}
	}
	
	private boolean hijosYOCasado() {
		return (super.hijos > 0) || this.getEstaCasado() == true;
	}

	private int pagoHorasDeTrabajo() {
	
		return super.horasTrabajo * 5;
	}

	public boolean getEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}
}
