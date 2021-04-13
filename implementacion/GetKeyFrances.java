package implementacion;

import estructura.IKeyCalculator;

/**
 * @author Carol Arevalo
 *
 */

public class GetKeyFrances <K, T> implements IKeyCalculator<K, T>{

    @Override
    public K GetKey(T value) {
        diccionario palabra = (diccionario)value;
		return (K)palabra.frances;
    }
    
}