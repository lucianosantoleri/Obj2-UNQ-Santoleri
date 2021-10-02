package tp_numsYstreams;

public enum Lesion {
	
	ROJO(20,"Maximo riesgo"),GRIS(15,"Riesgo avanzado"),AMARILLO(10,"Riesgo medio"),MIEL(5, "apenas riesgoso");
	
	private int nivelRiesgo;
	private String descripcion;
	
	Lesion(int riesgo, String desc) {
		this.nivelRiesgo = riesgo;
		this.descripcion = desc;
	}
	
	public int getNivelRiesgo() {
		return nivelRiesgo;
	}
	public void setNivelRiesgo(int nivelRiesgo) {
		this.nivelRiesgo = nivelRiesgo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
