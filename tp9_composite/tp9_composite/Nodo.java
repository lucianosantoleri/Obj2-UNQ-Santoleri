package tp9_composite;

import java.util.ArrayList;
import java.util.List;

public class Nodo extends ShapeShifter {
	
	private List<IShapeShifter> elementos = new ArrayList<IShapeShifter>();
	private int profundidad;
	
	public Nodo() {}

	public Nodo(IShapeShifter shapeShifter, IShapeShifter otroShapeShifter) {
		this.elementos.add(shapeShifter);
		this.elementos.add(otroShapeShifter);
		this.profundidad = mayorProfundidadEntre(shapeShifter, otroShapeShifter) + 1;
	}
	
	// existe para el m�todo flat() que devuelve un nuevo nodo con los elementos achatados que le paso por par�metro
	public Nodo(List<IShapeShifter> elementosAchatados) {
		this.elementos = elementosAchatados;
	}

	int mayorProfundidadEntre(IShapeShifter shapeShifter, IShapeShifter otroShapeShifter) {
		return Math.max(shapeShifter.deepest(), otroShapeShifter.deepest());
	}

	@Override
	public int deepest() {
		return this.profundidad;
	}
	
	@Override
	public IShapeShifter flat() {
		List<IShapeShifter> elementosAchatados = new ArrayList<IShapeShifter>();
		//por cada elemento hace un append a la lista de elementosAchatados si tuviera otros dentro
		this.getElementos().stream().forEach(elem -> elementosAchatados.addAll(((ShapeShifter) elem).getElementos()));
		return new Nodo(elementosAchatados);
	}
	
	@Override
	public List<Integer> values() {
		 /*List<Integer> valores = ((ShapeShifter) this.flat()).getElementos().stream().map(elem -> elem.getValue()).toList();
		  * En teor�a funciona, pero por un bug de eclipse no compila "Cannot infer type argument(s) for <R> map(Function<? super T,? extends R>)"*/
		List<Integer> valores = new ArrayList<Integer>();
		this.getElementos().stream().forEach(elem -> valores.addAll(elem.values()));
		return valores;
	}

	@Override
	public Boolean contiene(IShapeShifter elemento) {
		return this.getElementos().contains(elemento);
	}

	@Override
	public List<IShapeShifter> getElementos() {
		return this.elementos;
	}
	
}