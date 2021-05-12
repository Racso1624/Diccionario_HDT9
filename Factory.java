/*
 * Factory
 */
public class Factory {

    public MapGeneral factory(int opcion) {

        if (opcion == 1) {
            return new RedBlackTree();
        } else if (opcion == 2) {
            return new hashMap();
        } else {
            return null;
        }

    }

}