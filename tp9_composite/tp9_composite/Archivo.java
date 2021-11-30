package tp9_composite;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends ElementoFileSystem {

	public Archivo(String nombre,int size, LocalDate fecha) {
		super(nombre, fecha);
		setSize(size);
	}

	@Override
	public int totalSize() {
		return this.totalSize;
	}

	@Override
	public IFileSystem oldestElement() {
		//elemento m�s antiguo
		return this;
	}

	@Override
	public IFileSystem lastModified() {
		//elemento m�s nuevo
		return this;
	}

	@Override
	public List<IFileSystem> getContenido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarElemento(IFileSystem elemento) {
		// no puede agregar
	}

	@Override
	public boolean contains(IFileSystem elemento) {
		// no tiene permitido contener ning�n elemento
		return false;
	}

	@Override
	protected String estructuraPrint(String separador) {
		return separador + "-" + this.getNombre();
	}

}