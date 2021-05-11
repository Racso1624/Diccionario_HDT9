import static org.junit.jupiter.api.Assertions.*;

public class RedBlackTreeTest {

    RedBlackTree arbol;
    @org.junit.Test
    public void add()
    {
        arbol   = new RedBlackTree();
        arbol.insert("JUnit","Comprobado");
        assertEquals(1,arbol.size());

    }

    @org.junit.Test
    public void contains()
    {
        arbol   = new RedBlackTree();
        arbol.insert("JUnit","Comprobado");
        Association valor = new Association("JUnit","Comprobado");
        RedBlackNode prueba =arbol.search(valor);
        assertEquals("Comprobado",prueba.key.getValue());


    }



}