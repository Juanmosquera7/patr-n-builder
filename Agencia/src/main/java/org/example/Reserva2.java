package org.example;

public class Reserva2 {
    //Atributos de la clase Reserva

    private String fechaSalida;
    private int duracion;
    private String tipoAlojamiento;
    private  String preferenciasTransporte;
    private String actividadesPlaneadas;
    private String dietasEspeciales;

    //Constructor Privado para la clase Reserva


    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public String getPreferenciasTransporte() {
        return preferenciasTransporte;
    }

    public void setPreferenciasTransporte(String preferenciasTransporte) {
        this.preferenciasTransporte = preferenciasTransporte;
    }

    public String getActividadesPlaneadas() {
        return actividadesPlaneadas;
    }

    public void setActividadesPlaneadas(String actividadesPlaneadas) {
        this.actividadesPlaneadas = actividadesPlaneadas;
    }

    public String getDietasEspeciales() {
        return dietasEspeciales;
    }

    public void setDietasEspeciales(String dietasEspeciales) {
        this.dietasEspeciales = dietasEspeciales;
    }

    public Reserva2(String fechaSalida, int duracion, String tipoAlojamiento, String preferenciasTransporte, String actividadesPlaneadas, String dietasEspeciales) {
        this.fechaSalida = fechaSalida;
        this.duracion = duracion;
        this.tipoAlojamiento = tipoAlojamiento;
        this.preferenciasTransporte = preferenciasTransporte;
        this.actividadesPlaneadas = actividadesPlaneadas;
        this.dietasEspeciales = dietasEspeciales;
    }
    //Método estático para obtener una instancia de ReservaBuilder

    public static ReservaBuilder builder(){
        return new ReservaBuilder();
    }
}



