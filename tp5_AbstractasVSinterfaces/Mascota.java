
public class Mascota extends SerVivo {

	private String raza;
	
	public Mascota(String nom, String raza) {
		super.nombre = nom;
		this.raza = raza;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getRaza() {
		return raza;
	}	
}
