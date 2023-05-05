public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Felipe", "Juan", "Camila", "Diana", "Luisa"};
        StringBuilder cadena = new StringBuilder();

        for (int i = 0; i < nombres.length; i++ ) {

            if (i == nombres.length - 1) {
                cadena.append(nombres[i]);
            } else {
                cadena.append(nombres[i]).append(", ");
            }
        }
        System.out.println(cadena);
    }
}