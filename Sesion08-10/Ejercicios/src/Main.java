import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String textoAlReves = reverse("hola mundo");
        System.out.println(textoAlReves);

        ejercicio1();

        ejercicio2();

        ejercicio3();

        /*
        Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para
        ser añadidos al mismo.
        Respuesta: Si se le dan altas capacidades de almacenamiento a una variable de este tipo, puede llegar a consumir
        más recursos de los que podrían ser necesarios, y puede además no ser esta la capacidad necesaria dependiendo del
        programa que se está construyendo. A la larga, esto podría ralentizar la ejecución del programa, siendo este un
        programa completamente ineficiente.
         */

        ejercicio5();

        ejercicio6();

        try {
            dividePorCero(1, 0);
        }
        catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }

        String absolutePath = System.getProperty("user.dir");

        fileStream(absolutePath + "\\src\\test.txt", absolutePath + "\\src\\output.txt");

        conversor.ficheroConversion(absolutePath + "\\src\\temperaturas.txt", absolutePath + "\\src\\conversion.txt");
    }

    private static void ejercicio6() {
    /*
    Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro
    bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
    Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     */

        ArrayList<Integer> listaEnteros2 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listaEnteros2.add(i);
        }
        for (int i = 0; i < listaEnteros2.size() - 1; i++) {
            if (listaEnteros2.get(i) % 2 == 0) {
                listaEnteros2.remove(listaEnteros2.get(i));
            }
            System.out.println(listaEnteros2.get(i));
        }

//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            listaEnteros2.add(i);
//        }
    }

    private static void ejercicio5() {
    /*
    Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente
    el valor de cada elemento.
     */
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Hola mundo,");
        listaString.add(" soy ");
        listaString.add("una ");
        listaString.add("lista\n");

        LinkedList<String> listaEnlazada = new LinkedList<>(listaString);
        for (String elementArrayList: listaString) {
            System.out.print(elementArrayList);
        }

        for (String elementLinked: listaEnlazada) {
            System.out.print(elementLinked);
        }
    }

    private static void ejercicio3() {
    /*
     Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra
     el resultado final.
     */
        Vector<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(4);
        vector.add(6);
        vector.add(8);
        vector.add(0);
        vector.remove(2);
        vector.remove(1);
        System.out.println(vector);
    }

    private static void ejercicio2() {
    /*
    Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas
    dimensiones.
     */
        int[][] listaEnteros = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 0}};
        for (int i=0; i < listaEnteros.length; i++){
            for (int j=0; j < listaEnteros[i].length; j++) {
                System.out.println("Valor actual: " + listaEnteros[i][j] + " ubicado en la fila: "+ i + " y en la columna " + j);
            }
        }
    }

    private static void ejercicio1() {
        // Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] nombres = {"Felipe", "Mariana", "Sofía", "Andrés"};
        for (String nombre: nombres) {
            System.out.println(nombre);
        }
    }

    // Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh"
    public static String reverse(String texto) {
        StringBuilder textoAlReves = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0 ; i--) {
            textoAlReves.append(texto.charAt(i));
        }
        return textoAlReves.toString();
    }

    public static float dividePorCero(float numero1, float numero2) throws ArithmeticException {
    /*
    Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
    que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje
    "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    */
        if(numero2 == 0) {
            throw new ArithmeticException("Esto no puede hacerse");
        }
        return numero1 / numero2;
    }

    private static void fileStream(String fileIn, String fileOut) {
        /*
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea
        de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
         */
        try {
            InputStream entrada = new FileInputStream(fileIn);
            try {
                byte[] contenido = entrada.readAllBytes();
                try {
                    PrintStream output = new PrintStream(fileOut);
                    for (byte letra: contenido) {
                        output.print((char)letra);
                    }
                    output.close();
                } catch (IOException e) {
                    e.getMessage();
                }
                entrada.close();
            } catch (IOException e) {
                System.out.println("No se puede abrir el archivo " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
        }
    }
}