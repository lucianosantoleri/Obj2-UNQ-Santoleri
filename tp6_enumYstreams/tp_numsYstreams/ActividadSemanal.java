package tp_numsYstreams;

public class ActividadSemanal {

	private DIA diaDeLaSemana;
	private int horaInicio;
	private int duracion;
	private DEPORTE deporte;
	
	public DIA getDiaDeLaSemana() {
		return diaDeLaSemana;
	}
	public void setDiaDeLaSemana(DIA diaDeLaSemana) {
		this.diaDeLaSemana = diaDeLaSemana;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public DEPORTE getDeporte() {
		return deporte;
	}
	
	public int costoDeActividad() {
		return 0;
	}
 }
