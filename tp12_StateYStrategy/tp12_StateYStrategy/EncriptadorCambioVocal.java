package tp12_StateYStrategy;

import java.util.*;

public class EncriptadorCambioVocal extends EncriptadorNaive {

	@Override
	public String encriptar(String texto) {
		
		List<String> text = Arrays.asList(texto);
		
		text.stream().forEach(caracter -> this.cambiarASiguienteSiEsVocal(caracter));
		return text.toString();
	}
	
	@Override
	public String desencriptar(String texto) {
		
		List<String> text = Arrays.asList(texto);
		
		text.stream().forEach(caracter -> this.cambiarAAnteriorSiEsVocal(caracter));
		return text.toString();
	}
	
	public Boolean esVocal(String letra) {
		
		List<String> vocales = Arrays.asList("a", "e", "i" , "o" , "u");
		if (vocales.contains(letra)) {
			return true;
		}
		return false;
	}
	
	public String cambiarASiguienteSiEsVocal(String letra) {
		if(this.esVocal(letra)) {
			this.cambioVocalSiguiente(letra);
		}
		return letra;
	}
	
	public String cambiarAAnteriorSiEsVocal(String letra) {
		if(this.esVocal(letra)) {
			this.cambioVocalAnterior(letra);
		}
		return letra;
	}
	
	public String cambioVocalSiguiente(String vocal) {
		switch(vocal) {
			
		case "a": vocal = "e";
		break;
		case "e": vocal = "i";
		break;
		case "i": vocal = "o";
		break;
		case "o": vocal = "u";
		break;
		case "u": vocal = "a";
		break;
		}
		return vocal;
	}
	
	public String cambioVocalAnterior(String vocal) {
		switch(vocal) {
			
		case "a": vocal = "u";
		break;
		case "e": vocal = "a";
		break;
		case "i": vocal = "e";
		break;
		case "o": vocal = "i";
		break;
		case "u": vocal = "o";
		break;
		}
		return vocal;
	}
}
