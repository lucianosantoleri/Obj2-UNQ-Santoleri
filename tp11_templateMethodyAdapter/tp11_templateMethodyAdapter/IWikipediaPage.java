package tp11_templateMethodyAdapter;

import java.util.List;
import java.util.Map;

public interface IWikipediaPage {

	String getTitle();

	List<IWikipediaPage> getLinks();

	Map<String, IWikipediaPage> getInfobox();
	
}