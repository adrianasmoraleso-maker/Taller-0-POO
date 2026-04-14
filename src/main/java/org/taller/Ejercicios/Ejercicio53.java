package org.taller.Ejercicios;

class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    void confirmar() {
        activa = true;
        System.out.println("Reserva de " + nombreCliente + " para el " + fecha + " CONFIRMADA.");
    }

    void cancelar() {
        activa = false;
        System.out.println("Reserva de " + nombreCliente + " para el " + fecha + " CANCELADA.");
    }
}

public class Ejercicio53 {

    public static void main(String[] args) {

        System.out.println("\n=== Reserva ===\n");
        Reserva res = new Reserva();
        res.nombreCliente = "Juliana Ospina";
        res.fecha = "2025-08-15";

        System.out.println("\nConfirmar Reserva\n");
        res.confirmar();
        System.out.println("\nCancelar Reserva\n");
        res.cancelar();
    }
}
