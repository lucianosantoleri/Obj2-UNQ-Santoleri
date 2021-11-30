package tp11_templateMethodyAdapter;

import java.util.List;

public abstract class Filtro {
	/*
	 * Este ejericios aplica al patr�n Template Method. El m�todo plantilla en espec�fico es getSimilarPages. Y el m�todo Hook es procesarHeuristica,
	 * el cu�l lo deben implementar a su manera las subclases de Filtro.
	 */

	protected  List<IWikipediaPage> getSimilarPages(WikipediaPage pagina, List<IWikipediaPage> listaDePaginas) {
		List<IWikipediaPage> paginasFiltradas = listaDePaginas.stream().filter(pag -> this.procesarHeuristica(pagina, pag)).toList();
		return paginasFiltradas;
	}

	protected abstract Boolean procesarHeuristica(WikipediaPage pagina, WikipediaPage otraPagina);

}