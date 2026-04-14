package org.taller.Ejercicios;

class Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    void abordar(int cantidad) {
        pasajeros += cantidad;
        System.out.println(cantidad + " Pasajeros abordaron. Total a bordo: " + pasajeros);
    }

    void mostrarInfo() {
        System.out.println("Vuelo de " + aerolinea + " a " + destino);
        System.out.println("Pasajeros en total: " + pasajeros);
    }
}

public class Ejercicio60 {

    public static void main(String[] args) {


        System.out.println("\n---Pasajeros Vuelo-----------------------------------\n");
        Avion avion = new Avion();
        avion.aerolinea = "Avianca";
        avion.destino = "Bogotá";
        avion.pasajeros = 0;
        avion.abordar(50);
        avion.abordar(30);
        avion.mostrarInfo();
        System.out.println("\n-----------------------------------------------------\n");
    }
}
