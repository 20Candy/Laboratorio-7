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
public class ListarDiccionario<K, T> implements IVisitar<K, T> {
	public void VisitarNodo(NodoArbol<K, T> arbol) {
		String listado = "";
		diccionario actual = (diccionario)arbol._value;
		listado = "Ingles: " + actual.ingles + " Español: " + actual.espanol + " Frances: " + actual.frances; 
		System.out.println(listado);
	}
}
