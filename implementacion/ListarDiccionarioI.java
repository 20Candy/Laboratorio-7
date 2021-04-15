/**
 * 
 */
package implementacion;

import estructura.IVisitar;
import estructura.NodoArbol;

/**
 * @author Carol Arevalo
 *
 */
public class ListarDiccionarioI<K, T> implements IVisitar<K, T> {
	public void VisitarNodo(NodoArbol<K, T> arbol) {
		String listado = "";
		diccionario actual = (diccionario)arbol._value;

		listado = "Ingles: " + actual.ingles + " Español: " + actual.espanol + " Frances: " + actual.frances; 
		System.out.println(listado);
	}
}
