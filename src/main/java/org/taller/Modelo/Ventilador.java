package org.taller.Modelo;

public class Ventilador {
    public String marca;
    public int velocidad;
    public boolean encendido;

    public void encender() {
        encendido = true;
        velocidad = 1;
        System.out.println("Ventilador " + marca + " encendido en velocidad " + velocidad);
    }

    public void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println("Ventilador " + marca + " apagado.");
    }

    public void subirVelocidad() {
        if (encendido) {
            velocidad++;
            System.out.println("Velocidad subida a " + velocidad);
        } else {
            System.out.println("El ventilador está apagado.");
        }
    }
}