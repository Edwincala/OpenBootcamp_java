package TiposDeDatos;

public class TiposDatosMain {
    public static void main(String[] args) {
        // Números enteros
        // byte: -128 a 127 (1 byte)
        byte varByte = 25;
        // short: -32,768 a 32,767 (2 bytes)
        short varShort = 25250;
        //int: -2,147,483,648 to 2,147,483,647 (4 bytes)
        int varInt = 2000500501;
        // long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (8 bytes)
        long varLong = 85055555614875L;

        // Números reales
        // float: 6 a 7 dígitos decimales (4 bytes)
        float varFloat = 4.555567f;
        // double: 15 dígitos decimales (8 bytes)
        double varDouble = 12.0987632176;

        // Boolean
        // boolean: true o false (1 byte)
        boolean varBool = true;
        boolean comparacion = 2 < 1;

        // char: un sólo caracter entre '' (2 bytes)
        char varChar = 'e';

        // String: cadena de caracteres entre ""
        String varString = "Hola mundo desde Java";

        System.out.println("Los datos de tipo entero son: byte (" + varByte + "), short (" + varShort + "), int (" + varInt + ") y long (" + varLong+")");
        System.out.println("Los datos de tipo real o con coma flotante son: float (" + varFloat + ") y double (" + varDouble + ")");
        System.out.println("Los datos de tipo boolean son " + varBool + " o " + comparacion);
        System.out.println("Un ejemplo de dato tipo char es '" + varChar+ "' entre comillas simples");
        System.out.println("Un ejemplo de datos String es: \"" + varString + "\" entre comillas dobles");
    }
}
