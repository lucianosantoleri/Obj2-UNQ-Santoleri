package tp11_templateMethodyAdapter;

import java.util.List;
import java.util.Map;

public class WikipediaPage implements IWikipediaPage {

	private String tituloPagina;
	private String link;
	private String infobox;

	@Override
	public String getTitle() {
		return tituloPagina;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		return null;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		return null;
	}

	public String getLink() {
		return link;
	}

	public void setInfobox(String infobox) {
		this.infobox = infobox;
	}
	
	public String infobox() {
		return infobox;
	}
}
