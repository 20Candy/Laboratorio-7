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
public class ListarDiccionarioE<K, T> implements IVisitar<K, T> {
	public void VisitarNodo(NodoArbol<K, T> arbol) {
		String listado = "";
		diccionario actual = (diccionario)arbol._value;
		listado = " Español: " + actual.espanol + " Ingles: " + actual.ingles +  " Frances: " + actual.frances; 
		System.out.println(listado);
	}
}