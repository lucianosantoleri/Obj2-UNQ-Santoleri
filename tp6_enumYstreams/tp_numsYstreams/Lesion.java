package tp_numsYstreams;

public enum Lesion {
	
	ROJO(20,"Maximo riesgo"),GRIS(15,"Riesgo avanzado"),AMARILLO(10,"Riesgo medio"),MIEL(5, "apenas riesgoso");
	
	int nivelRiesgo;
	String descripcion;
	
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
	
	public Lesion siguienteDeRojo() {
		return Lesion.GRIS;
	}
	
	public Lesion siguienteDeGris() {
		return Lesion.AMARILLO;
	}
	
	public Lesion siguienteDeAmarillo() {
		return Lesion.MIEL;
	}
	
	public Lesion siguienteDeMiel() {
		return Lesion.ROJO;
	}
}
