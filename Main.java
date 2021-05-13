import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MapGeneral Implementacion = null;
        Factory factory = new Factory();
        String[] frasenueva = {};

        try {
            File obj = new File("texto.txt");
            Scanner myReader = new Scanner(obj);
            // Si existe se hace un ciclo
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();// Se toma la linea de texto
                frasenueva = data.split(" ");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");// Se muestra el error
            e.printStackTrace();
            System.exit(1);// Sale del programa
        }

        System.out.println("\nBienvenido al Traductor");

        boolean var = false;
        a: while (var == false) {// Se realiza el ciclo principal

            String[] frase = frasenueva;

            boolean var2 = false;
            while (var2 == false) {
                System.out.println("\n\nIngrese la implemenacion que desea:");
                System.out.println("1) RedBlackTree");
                System.out.println("2) HashMap");
                System.out.println("3) Salir\n");

                try {

                    int opcion = scanner.nextInt();// Se verifica el numero

                    if (opcion == 1) {// Si es Ingles
                        Implementacion = factory.factory(opcion);
                        var2 = true;
                    } else if (opcion == 2) {// Si es Español
                        Implementacion = factory.factory(opcion);
                        var2 = true;
                    } else if (opcion == 3) {
                        System.out.println("Saliendo del Programa");
                        break a;// Se termina el ciclo principal
                    } else {
                        System.out.println("\nOpcion Incorrecta, Ingresela de Nuevo");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("\nOpcion Incorrecta, Ingresela de Nuevo");
                    scanner.nextLine();
                }
            }

            try {
                File obj = new File("Spanish.txt");
                Scanner myReader = new Scanner(obj);
                // Si existe se hace un ciclo
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();// Se toma la linea de texto
                    String[] dataList = data.split("	");// Se separa
                    String significado = "";
                    for (int i = 1; i < dataList.length; i++) {
                        significado += dataList[i];
                    }

                    Implementacion.insert(dataList[0], significado);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado.");// Se muestra el error
                e.printStackTrace();
                System.exit(1);// Sale del programa
            }

            for (int i = 0; i < frase.length; i++) {// Se realiza el ciclo del tamaño de la frase

                String palabra = frase[i];// Se toma cada una de las palabras de la frase
                System.out.println(palabra);

                if (Implementacion.ContainsKey(palabra.toLowerCase())) {
                    System.out.println("Hola si entre");
                    frase[i] = Implementacion.buscar(palabra.toLowerCase());
                } else {
                    String nuevaPalabra = "";// Se crea una nueva palabra
                    if (palabra.charAt(0) != '*' && palabra.charAt(palabra.length() - 1) != '*') {

                        for (int j = -1; j < (palabra.length() + 1); j++) {// Se crea un ciclo
                            if (j == -1 || j == palabra.length()) {
                                nuevaPalabra += "*";// Se suma el asterisco al inicio y al final
                            } else {
                                nuevaPalabra += palabra.charAt(j);// Se suma el caracter
                            }
                        }
                        frase[i] = nuevaPalabra;// Se agraga la palabra al array
                    }
                }
            }

            String frasefinal = "";// Se crea la frase final
            for (int i = 0; i < frase.length; i++) {// Se toman todas la palabras y se colocan en el string
                frasefinal += frase[i];
                frasefinal += " ";
            }
            System.out.println("La traduccion es: " + frasefinal);// Se imprime
        }

    }
}