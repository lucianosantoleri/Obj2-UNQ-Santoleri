package tp11_templateMethodyAdapter;

import java.util.ArrayList;
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
	public ArrayList<WikipediaPage> getLinks() {
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
