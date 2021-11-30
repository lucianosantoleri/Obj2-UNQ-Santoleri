package tp9_composite;

public interface IFileSystem {

	public int totalSize();

	public IFileSystem oldestElement(); // elemento más antiguo

	public IFileSystem lastModified(); // elemento más nuevo

	public void printStructure();

}