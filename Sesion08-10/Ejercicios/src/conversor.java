import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

public class conversor {
    /*
     Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
     Respuesta: Programa para hacer conversiones de temperatura de grados Celsius a grados Fahrenheit, Kelvin y Rankine desde una
     lista de temperaturas. Tiene como salida el archivo conversion.txt con las conversiones
     */

    private static float temperaturaF(float temperaturaC) {
        return (temperaturaC * 9 / 5) + 32;
    }

    private static float temperaturaK(float temperaturaC) {
        return (float) (temperaturaC + 273.15);
    }

    private static float temperaturaR(float temperaturaC) {
        return (float) ((temperaturaC * 9 / 5) + 491.67);
    }

    /**
     *
     * @param listaTemperaturas input file with the list of temperatures to be converted
     * @return listaTempNumber
     *
     * Function that receives the file path with the list of Celsius temperatures to be converted
     * and returns the list of temperatures as a Float ArrayList
     */
    private static ArrayList<Float> temperaturaAConvertir(String listaTemperaturas) {
        ArrayList<Float> listaTempNumber = new ArrayList<>();
        try {
            InputStream input = new FileInputStream(listaTemperaturas);
            try {
                byte[] contenido = input.readAllBytes();
                String listaString = new String(contenido, StandardCharsets.UTF_8);
                String[] listaStringSplit = listaString.split(",");
                for(String temp: listaStringSplit) {
                    listaTempNumber.add(Float.parseFloat(temp));
                }

                input.close();
            } catch (IOException e) {
                e.getMessage();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lista de temperaturas no encontrada: " + e.getMessage());
        }
        return listaTempNumber;
    }

    /**
     *
     * @param fichero input file with the list of temperatures to be converted
     * @return conversion
     *
     * Function that uses temperaturaAConvertir, creates the Hashmap and adds the converted temperature to it
     * returns a Hashmap with the converted temperatures from the ArrayList.
     */
    private static HashMap<String, String> conversion(String fichero) {
        ArrayList<Float> temperaturas = temperaturaAConvertir(fichero);
        HashMap<String, String> conversion = new HashMap<>();

        for (Float temperatura : temperaturas) {
            String tempF = "\n\t°Fahrenheit: " + temperaturaF(temperatura);
            String tempK = ",\n\tKelvin: " + temperaturaK(temperatura);
            String tempR = ",\n\tRankine: " + temperaturaR(temperatura);
            String valor = tempF + tempK + tempR;
            conversion.put("\n°Celsius " + temperatura, valor);
        }
        return conversion;
    }

    /**
     *
     * @param fileIn input file with the list of temperatures to be converted
     * @param fileOut output file with the converted temperatures
     * This function receives the input and output file absolute paths, and using the conversion function
     * creates the output function with the converted and formatted temperatures
     */
    public static void ficheroConversion(String fileIn, String fileOut) {
        HashMap<String, String> input = conversion(fileIn);
        try {
            PrintStream output = new PrintStream(fileOut);
            output.print(input);
            output.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
