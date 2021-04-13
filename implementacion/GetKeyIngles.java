package implementacion;

import estructura.IKeyCalculator;

/**
 * @author Carol Arevalo
 *
 */

public class GetKeyIngles <K, T> implements IKeyCalculator<K, T>{

    @Override
    public K GetKey(T value) {
        diccionario palabra = (diccionario)value;
		return (K)palabra.ingles;
    }
    
}
