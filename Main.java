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
        
        try {
            File obj = new File("Spanish.txt");
            Scanner myReader = new Scanner(obj);
            //Si existe se hace un ciclo
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();//Se toma la linea de texto
                String[] dataList = data.split(" ");//Se separa

            }   
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");//Se muestra el error
            e.printStackTrace();
            System.exit(1);//Sale del programa
        }

        System.out.println("\nBienvenido al Traductor");
        	
		boolean var = false;
        a: while(var == false){//Se realiza el ciclo principal

            //Se inician variables para el idioma y la frase
            int idiomanumero = 0;
            String[] frase = frasecompleta;
     
            boolean var2 = false;
            while(var2 == false){
                System.out.println("\n\nIngrese la traduccion que desea:");
                System.out.println("1) Ingles");
                System.out.println("2) Español");
                System.out.println("3) Francés");
                System.out.println("4) Salir\n");

                try {
                    
                    int opcion = scanner.nextInt();//Se verifica el numero

                    if(opcion == 1){//Si es Ingles
                        idiomanumero = 0;//Se coloca un 0
                        var2 = true;
                    }
                    else if(opcion == 2){//Si es Español
                        idiomanumero = 1;//Se coloca 1
                        var2 = true;
                    }
                    else if(opcion == 3){//Si es Francés
                        idiomanumero = 2;//Se coloca 2
                        var2 = true;
                    }
                    else if(opcion == 4){
                        System.out.println("Saliendo del Programa");
                        break a;//Se termina el ciclo principal
                    }
                    else{
                        System.out.println("\nOpcion Incorrecta, Ingresela de Nuevo");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("\nOpcion Incorrecta, Ingresela de Nuevo");
                    scanner.nextLine();
                }
            }
            
            for(int i = 0; i < frase.length; i++){//Se realiza el ciclo del tamaño de la frase

                String palabra = frase[i];//Se toma cada una de las palabras de la frase
                int contadorpalabras = 0;//Se inicia un contador
    
                for(int j = 1; j <= cantidadPalabras; j++) {//Se realiza un ciclo con la cantidad de palabras en el diccionario
                    Node nodo = binarySearchTree.search(binarySearchTree.getRoot(), j);//Se toma cada nodo
                    String[] llave = nodo.getTraduccion();//Se toma el array de palabras de cada nodo

                    for(int k = 0; k < llave.length; k++){//Se hace un ciclo en el array
    
                        String traduccion = llave[k];
                        if(traduccion.equalsIgnoreCase(palabra)){//Se verifica si la palabra esta en el array del nodo
                            frase[i] = llave[idiomanumero];//Si es asi, se cambia por la que se desea, y se agrega al array
                        }
                        else{
                            contadorpalabras++;//Si no se hace un contador de palabras que se pasan
                        }
                    }
                }

                int limite = cantidadPalabras * 3;//Se coloca el limite de veces del contador
                if(contadorpalabras == limite){//Si el contador es igual al limite
                    String nuevaPalabra = "";//Se crea una nueva palabra
                    if(palabra.charAt(0) != '*' && palabra.charAt(palabra.length() - 1) != '*'){//Se compara si no existen asteriscos en la palabra
                        for(int j = -1; j < (palabra.length() + 1); j++){//Se crea un ciclo
                            if(j == -1 || j == palabra.length()){
                                nuevaPalabra += "*";//Se suma el asterisco al inicio y al final
                            }
                            else{
                                nuevaPalabra += palabra.charAt(j);//Se suma el caracter
                            }
                        }
                        frase[i] = nuevaPalabra;//Se agraga la palabra al array
                    }
                }
            }

            String frasefinal = "";//Se crea la frase final
            for(int i = 0; i < frase.length; i++){//Se toman todas la palabras y se colocan en el string
                frasefinal += frase[i];
                frasefinal += " ";
            }
            System.out.println("La traduccion es: " + frasefinal);//Se imprime
        } 

    }
}