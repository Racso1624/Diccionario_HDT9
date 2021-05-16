/**
 * Oscar Fernando Lopez Barrios 20679
 * Sebastian Aristondo Perez 20880
 * Estructuras de Datos
 * 
 * MapGeneral
 */

public interface MapGeneral<K, O> {

    //Se crean los metodos
    public void insert(K key, O object);

    public String buscar(K key);

    public boolean ContainsKey(K key);

}