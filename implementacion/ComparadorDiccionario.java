package implementacion;

import estructura.IComparator;

/**
 * @author Carol Arevalo
 *
 */

public class ComparadorDiccionario <K, T> implements IComparator<K,T>  {

    @Override
    public int Compare(K abb1, K abb2) {
        String uno = (String)abb1;
		String dos = (String)abb2;
		return uno.compareTo(dos);
    }
    
    
}
