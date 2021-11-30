package tp9_composite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends ElementoFileSystem {
	private List<IFileSystem> contenido = new ArrayList<IFileSystem>();

	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
	}

	@Override
	public int totalSize() {
		Integer totalSize = this.getContenido().stream().mapToInt(IFileSystem::totalSize).sum();
		return totalSize;
	}

	public IFileSystem oldestElement() {
		IFileSystem elemMasAntiguo = this.getContenido().stream().reduce(this, (elem, otro)-> ((ElementoFileSystem) elem).elemMasAntiguo(otro));
		return elemMasAntiguo;
	}

	@Override
	public IFileSystem lastModified() {
		IFileSystem elemMasNuevo = this.getContenido().stream().reduce(this, (elem, otro)-> ((ElementoFileSystem) elem).elemMasNuevo(otro));
		return elemMasNuevo;
	}

	@Override
	public List<IFileSystem> getContenido() {
		return this.contenido;
	}

	@Override
	public void agregarElemento(IFileSystem elemento) {
		this.contenido.add(elemento);		
	}
	
	@Override
	public boolean contains(IFileSystem elemento) {
		return this.getContenido().contains(elemento);
	}

	@Override
	protected String estructuraPrint(String separador) {
		String estructura = separador + "�" + this.getNombre() + "\n";
		String subSeparador = separador + "  ";
		return this.getContenido().stream().map(elem -> ((ElementoFileSystem) elem).estructuraPrint(subSeparador))
				.reduce(estructura, (acum, nuevo)-> acum + nuevo + "\n");
	}

}