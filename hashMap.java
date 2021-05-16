import java.util.HashMap;

/**
 * Oscar Fernando Lopez Barrios 20679
 * Sebastian Aristondo Perez 20880
 * Estructuras de Datos
 * 
 * hashMap
 * 
 * Dicho codigo fue tomado de uno de los ejemplos que vienen en libro, como
 * tambien algunos que fueron brindados en clase
 * 
 * @param <K>
 * @param <O>
 */
public class hashMap<K, O> extends HashMap<K, O> implements MapGeneral<K, O> {

    //Se crea el Mapa
    HashMap hMap;

    //Se crea un nuevo Mapa
    public hashMap() {
        hMap = new HashMap<String, String>();
    }

    //Se inserta al mapa
    @Override
    public void insert(K key, O object) {
        hMap.put(key, object);
    }

    //Se busca en el toma el valor de la llave
    @Override
    public String buscar(K key) {
        return hMap.get(key).toString();
    }

    //Se devuelve un booleano se esta la llave
    @Override
    public boolean ContainsKey(K key) {
        return hMap.containsKey(key);
    }

}
