package smartDevices;

public class SmartDevice {

    // atributos
    String fabricante;
    String color;
    double alto;
    double ancho;
    double largo;
    int bateria;
    String sistemaOperativo;
    int memoria;

    // constructores

    public SmartDevice() {
    }

    public SmartDevice(String fabricante, String color, double alto, double ancho, double largo, int bateria, String sistemaOperativo, int memoria) {
        this.fabricante = fabricante;
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.bateria = bateria;
        this.sistemaOperativo = sistemaOperativo;
        this.memoria = memoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getColor() {
        return color;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public int getBateria() {
        return bateria;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public int getMemoria() {
        return memoria;
    }
}
