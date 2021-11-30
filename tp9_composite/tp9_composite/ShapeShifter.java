package tp9_composite;
import java.util.Arrays;
import java.util.List;

public abstract class ShapeShifter implements IShapeShifter{	

	@Override
	public IShapeShifter compose(IShapeShifter elemento) {
		IShapeShifter composicion = new Nodo(this, elemento);
		return composicion;
	}
	
	/* IMPLEMENTO LOS COMPORTAMIENTOS DE LA HOJA COMO SI FUERAN PREDETERMINADOS, DE ESTA MANERA NO ROMPO CON EL PRINCIPIO DE 
	 * DISE�O DE JERARQU�AS DE CLASES, QUE DICE QUE UNA CLASE SOLO DEBER�A DEFINIR OPERACIONES QUE TIENEN SENTIDO EN SUS SUBCLASES
	 */
	
	public List<IShapeShifter> getElementos() {
		//se devuelve a s� misma en una lista porque esto es �til para el m�todo flat() en nodo
		return Arrays.asList(this);
	}
	public Boolean contiene(IShapeShifter elemento) {
		return false;
	}
	
	@Override
	public IShapeShifter flat() {
		/* Si el IShapeShifter posee una profundidad m�xima >= 1, entonces retorna un IShapeShifter de profundidad maxima 1 con todos los 
		IShapeShifter de profundidad 0 contenidos. En cualquier otro caso, retorna el mismo IShapeShifter.*/
		return this;
	}
	
	@Override
	public int deepest() {
		// 0 es la profundidad base de una hoja
		return 0;
	}

}