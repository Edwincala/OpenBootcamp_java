import smartDevices.SmartPhone;
import smartDevices.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartWatch Xiaomi7Pro = new SmartWatch("Xiaomi", "Blanco", 0.433, 28.8, 44.7, 235, "Android 6.0", 0, "iOS 12.0 o Android 6.0", true, true, true);
        SmartPhone SAMSUNGGalaxyS20FE5G128GB = new SmartPhone("Samsung", "Azul", 8.4, 74.5, 159.8,4500, "Android 10", 128, "Dynamic AMOLED\n" +
                "6,5 pulgadas", 12, 32, true, true);

        System.out.println(Xiaomi7Pro.getFabricante() + " - " + Xiaomi7Pro.getSistemaOperativo() + " - " + Xiaomi7Pro.getCompatibilidad());

        System.out.println(SAMSUNGGalaxyS20FE5G128GB.getFabricante()+ " - " + SAMSUNGGalaxyS20FE5G128GB.getSistemaOperativo() + " - " + SAMSUNGGalaxyS20FE5G128GB.getColor() + " - " + SAMSUNGGalaxyS20FE5G128GB.getMemoria());
    }
}