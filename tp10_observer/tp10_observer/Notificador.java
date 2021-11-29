package tp10_observer;

import java.io.File;

public class Notificador {

	public SistemaDeReferencias sistema;
	private File file;
	
	public Notificador() {
		this.sistema = new SistemaDeReferencias(null);
	}
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
}
