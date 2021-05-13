import java.util.HashMap;

/**
 * 
 * Universidad del Valle de Guatemala
 * 
 * Dicho codigo fue tomado de uno de los ejemplos que vienen en libro, como
 * tambien algunos que fueron brindados en clase
 * 
 * @param <K>
 * @param <O>
 */
public class hashMap<K, O> extends HashMap<K, O> implements MapGeneral<K, O> {

    HashMap hMap;

    public hashMap() {
        hMap = new HashMap<String, String>();
    }

    @Override
    public void insert(K key, O object) {
        hMap.put(key, object);
    }

    @Override
    public String buscar(K key) {
        return hMap.get(key).toString();
    }

    @Override
    public boolean ContainsKey(Object key) {
        return hMap.containsKey(key);
    }

}
