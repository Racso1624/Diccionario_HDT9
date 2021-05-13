import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class RedBlackTreeTest {

    RedBlackTree arbol;

    @org.junit.Test
    public void add() {
        arbol = new RedBlackTree();
        arbol.insert("JUnit", "Comprobado");
        assertEquals(1, arbol.size());

    }

    @org.junit.Test
    public void contains() {
        arbol = new RedBlackTree();
        arbol.insert("JUnit", "Comprobado");
        arbol.insert("Hola", "Comprobado2");
        Association valor = new Association("JUnit", "");
        RedBlackNode prueba = arbol.search(valor);
        assertEquals("Comprobado", prueba.key.getValue());

    }

    @Test
    public void constainsKey() {
        arbol = new RedBlackTree();
        arbol.insert("JUnit", "Comprobado");
        assertEquals(true, arbol.ContainsKey("JUnit"));
    }

    @Test
    public void buscarr() {
        arbol = new RedBlackTree();
        arbol.insert("JUnit", "Comprobado");
        assertEquals("Comprobado", arbol.buscar("JUnit"));
    }

}