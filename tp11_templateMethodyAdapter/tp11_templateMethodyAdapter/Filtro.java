package tp11_templateMethodyAdapter;

import java.util.List;

public abstract class Filtro {

	public abstract List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia);
}
