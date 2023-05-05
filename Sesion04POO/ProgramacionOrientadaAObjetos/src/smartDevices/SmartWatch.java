package smartDevices;

public class SmartWatch extends SmartDevice{
    String compatibilidad;
    boolean seguimientoActividadFisica;
    boolean pulseraElastica;
    boolean controlLlamadas;

    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String color, double alto, double ancho, double largo, int bateria, String sistemaOperativo, int memoria, String compatibilidad, boolean seguimientoActividadFisica, boolean pulseraElastica, boolean controlLlamadas) {
        super(fabricante, color, alto, ancho, largo, bateria, sistemaOperativo, memoria);
        this.compatibilidad = compatibilidad;
        this.seguimientoActividadFisica = seguimientoActividadFisica;
        this.pulseraElastica = pulseraElastica;
        this.controlLlamadas = controlLlamadas;
    }

    public String getCompatibilidad() {
        return compatibilidad;
    }

    public boolean isSeguimientoActividadFisica() {
        return seguimientoActividadFisica;
    }

    public boolean isPulseraElastica() {
        return pulseraElastica;
    }

    public boolean isControlLlamadas() {
        return controlLlamadas;
    }

    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    public void setSeguimientoActividadFisica(boolean seguimientoActividadFisica) {
        this.seguimientoActividadFisica = seguimientoActividadFisica;
    }

    public void setPulseraElastica(boolean pulseraElastica) {
        this.pulseraElastica = pulseraElastica;
    }

    public void setControlLlamadas(boolean controlLlamadas) {
        this.controlLlamadas = controlLlamadas;
    }
}
