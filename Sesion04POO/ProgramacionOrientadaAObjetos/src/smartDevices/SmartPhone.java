package smartDevices;

public class SmartPhone extends SmartDevice {

    // atributos
    String resolucionPantalla;
    int camaraPrincipal;
    int camaraFrontal;
    boolean lectorHuella;
    boolean desbloqueoFacial;

    // constructores
    public SmartPhone() {
    }

    public SmartPhone(String fabricante, String color, double alto, double ancho, double largo, int bateria, String sistemaOperativo, int memoria, String resolucionPantalla, int camaraPrincipal, int camaraFrontal, boolean lectorHuella, boolean desbloqueoFacial) {
        super(fabricante, color, alto, ancho, largo, bateria, sistemaOperativo, memoria);
        this.resolucionPantalla = resolucionPantalla;
        this.camaraPrincipal = camaraPrincipal;
        this.camaraFrontal = camaraFrontal;
        this.lectorHuella = lectorHuella;
        this.desbloqueoFacial = desbloqueoFacial;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public int getCamaraPrincipal() {
        return camaraPrincipal;
    }

    public int getCamaraFrontal() {
        return camaraFrontal;
    }

    public boolean isLectorHuella() {
        return lectorHuella;
    }

    public boolean isDesbloqueoFacial() {
        return desbloqueoFacial;
    }
}
