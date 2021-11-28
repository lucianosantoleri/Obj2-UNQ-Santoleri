package tp11_templateMethodyAdapter;

import java.util.ArrayList;
import java.util.Map;

public interface IWikipediaPage {

	String getTitle(); /*retorna el titulo de la pagina*/
	
	ArrayList<WikipediaPage> getLinks(); /*retorna una lista de las paginas de wikipedia con las que se coencta*/
	
	Map<String,WikipediaPage> getInfobox(); /*retorna una Map con un valor en texto y la pagina que describe ese valor
	 										  que aparecen en los infobox de la pagina de wikipedia*/
}
