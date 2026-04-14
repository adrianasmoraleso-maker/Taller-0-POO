package org.taller.Modelo;

public class Puerta {
    public String material;
    public boolean abierta;

    public void abrir() {
        abierta = true;
        System.out.println("Puerta de " + material + " abierta.");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("Puerta de " + material + " cerrada.");
    }

    public void mostrarEstado() {
        System.out.println("Puerta: " + material);
        System.out.println("Estado: " + (abierta ? "Abierta" : "Cerrada"));
    }
}