package tp11_templateMethodyAdapter;

import java.util.List;
import java.util.stream.Collectors;

public class LinkEnComun extends Filtro{

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return wikipedia.stream().filter(pagina -> this.mismoLink(page, pagina)).collect(Collectors.toList());
	}

	private WikipediaPage mismoLink(WikipediaPage page, WikipediaPage pagina) {
		if (page.getLink().equals(pagina.getLink())) {
			return pagina;
		}
	}
}
