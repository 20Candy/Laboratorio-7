/**
 * 
 */
package estructura;

/**
 * @author moise
 *
 */
public class NodoArbol<K, T> {
	public T _value;
	public K _key;
	public NodoArbol<K, T> hijoIzquierdo;
	public NodoArbol<K, T> hijoDerecho;
	
	public NodoArbol() {
		hijoIzquierdo = null;
		hijoDerecho = null;
	}
	
	public NodoArbol(K key, T value) {
		_key = key;
		_value = value;
		hijoIzquierdo = null;
		hijoDerecho = null;
	}
}
