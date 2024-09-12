package org.example;

public class ReservaBuilder {
    // Atributos que coinciden con los de la clase Reserva
    private String fechaSalida;
    private int duracion;
    private String tipoAlojamiento;
    private String preferenciasTransporte;
    private String actividadesPlaneadas;
    private String dietasEspeciales;

    // Constructor privado para evitar instanciación directa
    ReservaBuilder() {}

    // Métodos para establecer los valores de los atributos y devolver el builder
    public ReservaBuilder fechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

    public ReservaBuilder duracion(int duracion) {
        this.duracion = duracion;
        return this;
    }

    public ReservaBuilder tipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
        return this;
    }

    public ReservaBuilder preferenciasTransporte(String preferenciasTransporte) {
        this.preferenciasTransporte = preferenciasTransporte;
        return this;
    }

    public ReservaBuilder actividadesPlaneadas(String actividadesPlaneadas) {
        this.actividadesPlaneadas = actividadesPlaneadas;
        return this;
    }

    public ReservaBuilder dietasEspeciales(String dietasEspeciales) {
        this.dietasEspeciales = dietasEspeciales;
        return this;
    }

    // Método para construir y devolver una instancia de Reserva
    public Reserva2 build() {
        return new Reserva2(fechaSalida, duracion, tipoAlojamiento, preferenciasTransporte, actividadesPlaneadas, dietasEspeciales);
    }
}

