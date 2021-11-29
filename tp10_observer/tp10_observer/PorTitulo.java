package tp10_observer;

import java.io.File;

public class PorTitulo implements ISuscriptor {

	public String titulo;
	
	@Override
	public void update(String tipoEvento, File file) {
		System.out.println(tipoEvento + file);
	}

	@Override
	public String getReferencia(String tipoEvento) {
		if (titulo.equals(tipoEvento))
		{
			return tipoEvento;
		}
		return null;
	}

}
