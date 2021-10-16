package tp7_SOLID;

public class Mail {

}

/* /* Claramente una de las violaciones es en esta clase con respecto a la clase ServidorPop en donde no se respeta el Single Responsibility Principle.
 * Una cuenta Mail deberia enviar Correo, y no el servirdor
 * Otro es el Open closed Principle, los atributos deberian estar private para respetar el encapsulamiento, una de las bases de este principio.
 *  */