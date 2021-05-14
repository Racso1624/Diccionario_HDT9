/*
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