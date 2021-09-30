package tp5_abstractasVSinterfaces;
import java.util.ArrayList;

public class Main {

	public static Persona pers1 = new Persona("Pablo", "Lopez", "21 de agosto 1993", 28);
	public static Mascota mascota1 = new Mascota("Masha", "caniche");
	public static Persona pers2 = new Persona("Ricardo", "Rodriguez", "18 de julio 1991", 30);
	public static Mascota mascota2 = new Mascota("Boby", "labrador");
	
	private static ArrayList<SerVivo> seresVivos = new ArrayList<SerVivo>();
	
	public ArrayList<SerVivo> getSeresVivos() {
		return seresVivos;
	}

	public void setSeresVivos(ArrayList<SerVivo> seresVivos) {
		Main.seresVivos = seresVivos;
	}
	
	public void aniadirSer(SerVivo ser) {
		seresVivos.add(ser);
	}
	
	public static void main(String[] args){
	    
		seresVivos.add(pers1);
		seresVivos.add(mascota1);
		seresVivos.add(mascota2);
		seresVivos.add(pers2);
	
		seresVivos.stream().forEach(s -> System.out.println("Hola " + s.nombre));
	}
}
