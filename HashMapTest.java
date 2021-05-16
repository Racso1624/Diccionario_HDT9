import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Oscar Fernando Lopez Barrios 20679
 * Sebastian Aristondo Perez 20880
 * Estructuras de Datos
 * 
 * HashMapTest
 */

public class HashMapTest {
    
    hashMap<String, String> mapa = new hashMap<String,String>();


    @Test
    public void insertar() {
        mapa.put("llave","valor");
        System.out.println(mapa.get("llave"));
        assertEquals(true,mapa.containsKey("llave"));

    }


    @Test
    public void obtener() {
        mapa.put("the","la");
        mapa.put("woman","mujer");
        mapa.put("homework","tarea");
        assertEquals("la",mapa.get("the"));

    }


}
