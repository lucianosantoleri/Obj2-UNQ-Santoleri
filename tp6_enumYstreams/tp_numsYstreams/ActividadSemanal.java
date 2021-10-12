package tp_numsYstreams;

public class ActividadSemanal {

	private DIA diaDeLaSemana;
	private int horaInicio;
	private int duracion;
	private DEPORTE deporte;
	private int costo;
	
	public ActividadSemanal(DIA dia, int horaIni, int dura, DEPORTE depo, int valor) {
		this.diaDeLaSemana = dia;
		this.horaInicio = horaIni;
		this.duracion = dura;
		this.deporte = depo;
		this.costo = valor;
	}
	
	public int getCosto() {
		return costo;
	}
	
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
		
		switch(diaDeLaSemana) {
			case LUNES:
				costo = 500;
			case MARTES:
				costo = 500;
			case MIERCOLES:
				costo = 500;
			case JUEVES:
				costo = 1000;
			case VIERNES:
				costo = 1000;
			case SABADO:
				costo = 1000;
			case DOMINGO:
				costo = 1000;
		}
		return costo;
	}
 }
