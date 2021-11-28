package tp11_templateMethodyAdapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WikipediaPageTestCase {

	public WikipediaPage paginaWiki;
	public MismaLetraInicial filtroUno;
	public LinkEnComun filtroDos;
	public PropiedadEnComun filtroTres;
	public List<WikipediaPage> wikipedia;
	
	@BeforeEach
	public void setUp() {
		
		//sut
		paginaWiki = new WikipediaPage(null, null, null);
		filtroUno = new MismaLetraInicial();
		filtroDos = new LinkEnComun();
		filtroTres = new PropiedadEnComun();
		wikipedia = new ArrayList<WikipediaPage>();
	}
	
	@Test
	public void testProbandoFiltroUno() {
		
		assertEquals(filtroUno.getSimilarPages(paginaWiki, wikipedia), null);
	}
	
	@Test
	public void testProbandoFiltroDos() {
		
		assertEquals(filtroDos.getSimilarPages(paginaWiki, wikipedia), null);
	}
	
	@Test public void testProbandoFiltroTres() {
		
		assertEquals(filtroTres.getSimilarPages(paginaWiki, wikipedia), null);
	}
}
