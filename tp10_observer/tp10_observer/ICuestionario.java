package tp10_observer;

import java.util.Set;

public interface ICuestionario {

	public Set<String> getPreguntas();

	public Boolean evaluarRespuesta(String pregunta, String respuesta);

	public Boolean esUltimaPregunta(String string);

	public String getNombreGanador();

}