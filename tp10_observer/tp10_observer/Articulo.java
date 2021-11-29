package tp10_observer;

import java.util.ArrayList;
import java.util.List;

public class Articulo {

    private String titulo;
    private List<Autor> autores;
    private String tipoDeArticulo;
    private String lugarDePublicacion;
    private String palabrasClaves;

    public Articulo(String titulo, String tipoDeArticulo, String lugarDePublicacion, String palabrasClaves) {
        this.setTitulo(titulo);
        this.setTipoDeArticulo(tipoDeArticulo);
        this.setLugarDePublicacion(lugarDePublicacion);
        this.palabrasClaves = palabrasClaves;
        this.autores = new ArrayList<>();
    }

    public String getPalabrasClaves() {
        return palabrasClaves;
    }

    public void setAutor(Autor autor) {
        this.autores.add(autor);
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public void setTipoDeArticulo(String tipoDeArticulo) {
		this.tipoDeArticulo = tipoDeArticulo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public void setLugarDePublicacion(String lugarDePublicacion) {
		this.lugarDePublicacion = lugarDePublicacion;
	}
}