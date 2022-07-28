import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;

        int opcion, number;
        do {
            System.out.println("\n" + "Introduzca el numero del ejecicio que quiere revisar: ");
            System.out.println("1. Reverce String");
            System.out.println("2. Array");
            System.out.println("3. Array bidimensional");
            System.out.println("4. Vectores");
            System.out.println("5. Problematica de los vectores");
            System.out.println("6. ArrayList to Linked List");
            System.out.println("7. ArrayList autocompletada");
            System.out.println("8. Throws and Throw ");
            System.out.println("9. InputStream PrintStream" + "\n");
            scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: {
                    reverse();
                }
                break;
                case 2: {
                    readArray();
                }
                break;
                case 3: {
                    arrayBidi();
                }
                break;
                case 4: {
                    vector();
                }
                break;
                case 5: {
                    errorVector();
                }
                break;
                case 6: {
                    ArrayListS();
                }
                break;
                case 7: {
                    ArrayListI();
                }
                break;
                case 8: {
                    DividePorCero();
                }
                break;
                case 9: {
                    IO();
                }
                break;
                default:

                    System.out.println("Wrong input..!");
                    break;

            }
            System.out.println("\n" + "Presiona 0 para continuar" + "\n");
            number = scanner.nextInt();
        }
        while (number == 0);


    }

    private static void reverse() {
        // Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        Scanner scanner;

        System.out.println("Escribe el texto que quieres al reverso");
        scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        String reverseText = "";

            for (int i = 0; i < texto.length(); i++) {
                int valor = texto.length() - 1;
                reverseText += texto.charAt(valor - i);
            }

        System.out.println( reverseText);
    }

    private static void readArray() {
        // Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        Scanner scanner;

        System.out.println("Escribe el largo de la lista de datos");
        scanner = new Scanner(System.in);
        int largo = scanner.nextInt();
        String[] array = new String[largo];

        System.out.println("Escribe " + largo + " datos para el array");
        for (int i = 0; i < array.length; i++) {
            scanner = new Scanner(System.in);
            array[i] = scanner.next();
        }

        for (String data : array) {

            System.out.println(data);

        }

    }

    private static void arrayBidi() {
        // Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        Scanner scanner;

        System.out.println("Agrega 6 numeros enteros:");
        scanner = new Scanner(System.in);
        int valor0 = scanner.nextInt();
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();
        int valor4 = scanner.nextInt();
        int valor5 = scanner.nextInt();



        int[][] array = {
                { valor0, valor1 },
                { valor2, valor3 },
                { valor4, valor5 },
        };

        int i = 0, j = 0;

        for (int[] a : array) {
            j = 0;
            for (int s : a) {
                System.out.println(s + " esta en la posicion " + j + " - " + i);
                j++;
            }
            i++;
        }

    }

    private static void vector() {
        // Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2do y 3er elemento y muestra el resultado final.
        Scanner scanner;

        Vector vectores = new Vector(5);

        System.out.println("Ingresa 5 animales");
        scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            vectores.add(scanner.next());
        }

        System.out.println("Vector original " + vectores);

        vectores.remove(2);
        vectores.remove(1);

        System.out.println("Vector modificado " + vectores);


    }

    private static void errorVector() {
        // Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        System.out.print("""
                El problema de intentar ingresar 1000 entradas a la vez en un vector con la capacidad de aumento predeterminada es que
                el vector tendra que repetir multiples veces el proceso de redimensionarse, lo cual consumiria mucha memoria en el ordenador
                """);

    }

    private static void ArrayListS() {
        // Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        Scanner scanner;

        ArrayList<String> nombres = new ArrayList<>();
        System.out.println("Ingresa 4 nombres");
        scanner = new Scanner(System.in);
        nombres.add(scanner.next());
        nombres.add(scanner.next());
        nombres.add(scanner.next());
        nombres.add(scanner.next());

        LinkedList<String> names = new LinkedList<>();
        for (int i = 0; i < nombres.size(); i++) {
            names.add(nombres.get(i));
            System.out.println(names.get(i));
        }

    }

    private static void ArrayListI(){
        // Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final.

        Scanner scanner;

        ArrayList<Integer> numbers = new ArrayList<>();
        int j = 0;

        for (int i = 0; i < 10; i++) {
            numbers.add(i + 1);
        }

        while(j < numbers.size() + 2 - j){
            if(numbers.get(j) % 2 == 0 ){
                numbers.remove(j);
            }
            System.out.println(numbers.get(j));
            j++;
        }

    }

    private static void DividePorCero() throws ArithmeticException {
        // Crea una función DividePorCero.
        // Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".

        Scanner scanner;

        System.out.println("Ingrese el numero que quiere dividir por 0");
        scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        try {

            int result = numero / 0;

            System.out.println(result);

        }catch(ArithmeticException e){

            System.out.println("Esto no puede hacerse");

        } finally {

            System.out.println("Continuemos");

        }
    }

    private static void IO(){
        // Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

        Scanner scanner;
        System.out.println("Ingrese la ruta del archivo que desea leer (Ejemplo: C:/Users/user/Desktop/NombreDelArchivo) con la extension corrsepondiente (jpg, txt, pdf)");
        scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        FilePermission permission = new FilePermission(path, "read");

        File file = new File(path);

        if (file.isFile()){
            System.out.println("File " + file.getName());
            try {
                InputStream fichero = new FileInputStream(file);

                byte[] datos = fichero.readAllBytes();
                fichero.close();

                System.out.println("Ingrese el nombre para la copia con la extension corrsepondiente (jpg, txt, pdf)");
                scanner = new Scanner(System.in);
                String nombre = scanner.nextLine();

                PrintStream salida= new PrintStream(nombre);
                salida.write(datos);
                salida.close();


            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            }

        } else if (file.isDirectory()) {
            System.out.println( file + " no es un archivo");
        }




    }

}


