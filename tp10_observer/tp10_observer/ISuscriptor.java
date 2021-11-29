package tp10_observer;

import java.io.File;

public interface ISuscriptor {
	
	void update(String tipoEvento, File file);

	public String getReferencia(String tipoEvento);
}
