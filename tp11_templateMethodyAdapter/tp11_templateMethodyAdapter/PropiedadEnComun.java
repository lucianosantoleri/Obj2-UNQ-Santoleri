package tp11_templateMethodyAdapter;

import java.util.List;
import java.util.stream.Collectors;

public class PropiedadEnComun extends Filtro{

	public PropiedadEnComun() {
		
	}

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return wikipedia.stream().filter(pagina -> this.mismoInfobox(page, pagina)).collect(Collectors.toList());
	}

	private Object mismoInfobox(WikipediaPage page, WikipediaPage pagina) {
		if (page.getInfobox().equals(pagina.getInfobox())) {
			return pagina;
		}
		return null;
	}
}
