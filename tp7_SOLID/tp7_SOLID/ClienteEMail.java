package tp7_SOLID;

import java.util.ArrayList;

public class ClienteEMail {
	// los atributos deber�an estar privados para no ser modificados directamente
	 ServidorPop servidor; //deber�a ser una instancia de IServidor, se viola el principio open-closed en caso de que se implemente otro tipo de
	 // servidor
	 String nombreUsuario;
	 String passusuario;
	 ArrayList<Correo> inbox; // deber�a ser un List porque esto est� sujeto solo a una instancia de ArrayList, y no por ejemplo de LinkedList
	 // viola el principio Open-Closed
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	// deber�a ser private, porque la idea es que se ejecute solo una vez, cuando se instancia la clase
	public void conectar(){
		//se deber�an usar getters
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo); // deber�a estar solo este procedimiento
		this.borrados.remove(correo); // esto deber�a llamar al mensaje eliminarBorrado(Correo), es c�digo repetido
	}
	
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		//se deber�an usar getters
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
