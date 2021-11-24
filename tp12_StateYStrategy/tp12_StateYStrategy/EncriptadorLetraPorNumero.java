package tp12_StateYStrategy;

import java.util.Arrays;
import java.util.List;

public class EncriptadorLetraPorNumero extends EncriptadorNaive {

	@Override
	public String encriptar(String texto) {
		
		List<String> text = Arrays.asList(texto);
		
		text.stream().forEach(caracter -> this.cambiarPorSuNumeroCorrespondiente(caracter));
		return text.toString();
	}
	
	private Object cambiarPorSuNumeroCorrespondiente(String caracter) {
		switch(caracter) {
		
		case "a": caracter = "1";
		break;
		case "e": caracter = "2";
		break;
		case "i": caracter = "3";
		break;
		case "o": caracter = "4";
		break;
		case "u": caracter = "5";
		break;
		}
		return caracter;
	}

	@Override
	public String desencriptar(String texto) {

		List<String> text = Arrays.asList(texto);
		
		text.stream().forEach(caracter -> this.cambiarPorSuLetraCorrespondiente(caracter));
		return text.toString();
	}

	private String cambiarPorSuLetraCorrespondiente(String caracter) {
		
		switch(caracter) {
		
		case "1": caracter = "a";
		break;
		case "2": caracter = "e";
		break;
		case "3": caracter = "i";
		break;
		case "4": caracter = "o";
		break;
		case "5": caracter = "u";
		break;
		}
		return caracter;
	}
}
