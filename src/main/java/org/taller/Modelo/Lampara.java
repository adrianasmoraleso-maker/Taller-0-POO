package org.taller.Modelo;

public class Lampara {
    public String marca;
    public boolean encendida;

    void encender() {
        encendida = true;
        System.out.println("Lámpara " + marca + " encendida.");
    }

    void apagar() {
        encendida = false;
        System.out.println("Lámpara " + marca + " apagada.");
    }

    void mostrarEstado() {
        System.out.println("Lámpara: " + marca);
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
    }
}

