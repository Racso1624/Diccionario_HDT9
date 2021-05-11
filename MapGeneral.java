import java.util.Collection;
import java.util.Set;

/**
 * Universidad del Valle de Guatemala
 *
 *Codigo tomado de los ejemplos de clase y del libro JavaStructures
 *
 * @param <K> parametro
 * @param <O> parametro
 */

public interface MapGeneral<K,O> {

    public void insert(K key, O object);
    public O buscar(K key);
    public boolean ContainsKey(K key);

}