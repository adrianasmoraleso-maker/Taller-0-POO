package org.taller.Modelo;

public class Celular {
    public String marca;
    public int bateria;
    public boolean prendido;

    public void encender() {
        if (bateria > 0) {
            prendido = true;
            System.out.println(marca + " encendido");
            System.out.println("Batería: " + bateria + "%");
        } else {
            System.out.println("Sin batería. No se puede encender.");
        }
    }

    public void apagar() {
        prendido = false;
        System.out.println(marca + " apagado.");
    }

    public void cargarBateria() {
        bateria = 100;
        System.out.println(marca + " cargado al 100%.");
    }
}