import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

/**
 * Oscar Fernando Lopez Barrios 20679
 * Sebastian Aristondo Perez 20880
 * Estructuras de Datos
 * 
 * RedBlackBSTTest
 */

public class RedBlackBSTTest {

    RedBlackBST arbol;


    @Test
    public void insertar() {
        arbol = new RedBlackBST();
        arbol.put("Llave","valor");
        assertEquals(true,arbol.contains("Llave"));

    }


    @Test
    public void obtener() {
        arbol = new RedBlackBST();
        arbol.put("the","la");
        arbol.put("woman","mujer");
        arbol.put("homework","tarea");
        assertEquals("la",arbol.get("the"));

    }

}