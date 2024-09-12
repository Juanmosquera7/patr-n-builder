package org.example;

public class Main {
    public static void main(String[] args){
        Reserva2 reserva1 = Reserva2.builder().fechaSalida("2024-12-15").tipoAlojamiento("Hotel").build();
        System.out.println("Reserva 1:");
        System.out.println("Fecha de salida: " + reserva1.getFechaSalida());
        System.out.println("Tipo de alojamiento: " + reserva1.getTipoAlojamiento());

        Reserva2 reserva2 =Reserva2.builder().fechaSalida("2024-12-07").tipoAlojamiento("Hostal").dietasEspeciales("Vegetariana").preferenciasTransporte("TUC TUC").actividadesPlaneadas("Visita Guiada:Templo Budista").build();
        System.out.println("\nReserva 2:");
        System.out.println("Fecha de salida: " + reserva2.getFechaSalida());
        System.out.println("Duración: " + reserva2.getDuracion() + " días");
        System.out.println("Tipo de alojamiento: " + reserva2.getTipoAlojamiento());
        System.out.println("Preferencias de transporte: " + reserva2.getPreferenciasTransporte());
        System.out.println("Actividades planeadas: " + reserva2.getActividadesPlaneadas());
        System.out.println("Dietas especiales: " + reserva2.getDietasEspeciales());
    }

}

