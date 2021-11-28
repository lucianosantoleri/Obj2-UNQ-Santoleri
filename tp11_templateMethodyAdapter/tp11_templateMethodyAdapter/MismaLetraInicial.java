package tp11_templateMethodyAdapter;

import java.util.List;
import java.util.stream.Collectors;

public class MismaLetraInicial extends Filtro {

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return wikipedia.stream().filter(pagina -> this.mismaLetraInicial(page,pagina)).collect(Collectors.toList());
	}

	public WikipediaPage mismaLetraInicial(WikipediaPage pagina1,WikipediaPage pagina2) {
		
		if(pagina1.getTitle().charAt(0) == pagina2.getTitle().charAt(0)) {
			return pagina2;
		}
	}
}
