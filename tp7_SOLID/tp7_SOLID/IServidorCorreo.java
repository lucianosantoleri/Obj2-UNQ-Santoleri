package tp7_SOLID;


import java.util.List;

public interface IServidorCorreo {
	// ac� encontramos violaciones al principio de Segregaci�nd de Interfaces
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);
	
	/*Todas estas firmas deber�an ser parte de otra interface que se encargue de el estado de un servidor.
	public float tazaDeTransferencia();
	public void resetear();
	
	public void realizarBackUp();*/

}