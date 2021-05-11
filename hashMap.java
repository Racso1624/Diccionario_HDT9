import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
/**
 * 
 * Universidad del Valle de Guatemala
 * 
 * Dicho codigo fue tomado de uno de los ejemplos que vienen en libro, como tambien algunos que fueron brindados en clase	
 * @param <K>
 * @param <O>
 */
public class hashMap<K,O> extends HashMap<K, O> implements MapGeneral<K,O> {

    @Override
    public void insert(K key, O object) {
        put(key,object);
    }

    @Override
    public O buscar(K key) {
        return get(key);
    }

    @Override
    public boolean ContainsKey(Object key) {
        // TODO Auto-generated method stub
        return super.containsKey(key);
    }

}
