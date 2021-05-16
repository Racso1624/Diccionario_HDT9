/**
 * Oscar Fernando Lopez Barrios 20679
 * Sebastian Aristondo Perez 20880
 * Estructuras de Datos
 * 
 * Factory
 */
public class Factory {

    public MapGeneral factory(int opcion) {

        if (opcion == 1) {
            return new RedBlackBST<>();
        } else if (opcion == 2) {
            return new hashMap();
        } else {
            return null;
        }

    }

}