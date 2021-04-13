/**
 * 
 */
package implementacion;

import estructura.IVisitar;
import estructura.NodoArbol;
import implementacion.diccionario;

/**
 * @author Carol Arevalo
 *
 */
public class ListarDiccionarioF<K, T> implements IVisitar<K, T> {
	public void VisitarNodo(NodoArbol<K, T> arbol) {
		String listado = "";
		diccionario actual = (diccionario)arbol._value;
		listado = " Frances: " + actual.frances + " Ingles: " + actual.ingles + " Español: " + actual.espanol;
		System.out.println(listado);
	}
}