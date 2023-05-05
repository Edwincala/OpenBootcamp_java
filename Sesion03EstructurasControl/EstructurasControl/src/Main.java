public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Felipe", "Juan", "Camila", "Diana", "Luisa"};
        StringBuilder cadena = new StringBuilder();

        for (String nombre : nombres) {

            if (nombre.equals(nombres[nombres.length-1])) {
                cadena.append(nombre);
            } else {
                cadena.append(nombre).append(", ");
            }
        }
        System.out.println(cadena);
    }
}