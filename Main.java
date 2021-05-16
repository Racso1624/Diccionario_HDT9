import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Oscar Fernando Lopez Barrios 20679
 * Sebastian Aristondo Perez 20880
 * Estructuras de Datos
 * 
 * Main
 */
public class Main {

    public static void main(String[] args) {

        //Se crean las instancias
        Scanner scanner = new Scanner(System.in);
        MapGeneral Implementacion = null;
        Factory factory = new Factory();
        String data = "";

        //Se revisa que el archivo de texto exista
        try {
            File obj = new File("texto.txt");
            Scanner myReader = new Scanner(obj);
            // Si existe se hace un ciclo
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();// Se toma la linea de texto
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

            String[] frase = data.split(" ");
            //Se hace el ciclo para las opciones
            boolean var2 = false;
            while (var2 == false) {
                System.out.println("\n\nIngrese la implemenacion que desea:");
                System.out.println("1) RedBlackTree");
                System.out.println("2) HashMap");
                System.out.println("3) Salir\n");

                //Se revisa que la opcion ingresada sea correcta
                try {

                    int opcion = scanner.nextInt();// Se verifica el numero

                    if (opcion == 1) {// Si RBT
                        Implementacion = factory.factory(opcion);
                        var2 = true;
                    } else if (opcion == 2) {// Si hashMap
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

            //Se revisa que exista el archivo
            try {
                File obj = new File("Spanish.txt");
                Scanner myReader = new Scanner(obj);
                // Si existe se hace un ciclo
                while (myReader.hasNextLine()) {
                    String data2 = myReader.nextLine();// Se toma la linea de texto
                    String[] dataList = data2.split("	");// Se separa
                    //Se toma todo el significado
                    String significado = "";
                    for (int i = 1; i < dataList.length; i++) {
                        significado += dataList[i];
                    }
                    //Se inserta a la implementacion
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

                if (Implementacion.ContainsKey(palabra.toLowerCase())) {//Si la encuentra en la implementacion
                    frase[i] = Implementacion.buscar(palabra.toLowerCase());//Se busca y la devuelve
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