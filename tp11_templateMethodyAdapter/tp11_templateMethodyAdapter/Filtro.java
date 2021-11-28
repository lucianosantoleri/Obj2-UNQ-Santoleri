package tp11_templateMethodyAdapter;

import java.util.ArrayList;

public abstract class Filtro {

	public abstract ArrayList<WikipediaPage> getSimilarPages(WikipediaPage page, ArrayList<WikipediaPage> wikipedia);
}
