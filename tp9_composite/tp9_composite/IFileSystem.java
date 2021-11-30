package tp9_composite;

public interface IFileSystem {

	public int totalSize();

	public IFileSystem oldestElement(); // elemento m�s antiguo

	public IFileSystem lastModified(); // elemento m�s nuevo

	public void printStructure();

}