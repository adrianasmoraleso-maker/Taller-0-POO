package org.taller.Modelo;

//Ejercicio 71: reescribir uno de los primeros ejercicios usando constructor cn parámetros

public class Lampara {
    public String marca;
    public boolean encendida;

    // Constructor con parámetros
    public Lampara(String marca, boolean encendida) {
        this.marca = marca;
        this.encendida = encendida;
    }

    public void encender() {
        encendida = true;
        System.out.println("Lámpara " + marca + " encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Lámpara " + marca + " apagada.");
    }

    public void mostrarEstado() {
        System.out.println("Lámpara: " + marca);
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
    }
}

// Código original

/*
public class Lampara {
    public String marca;
    public boolean encendida;

    public void encender() {
        encendida = true;
        System.out.println("Lámpara " + marca + " encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Lámpara " + marca + " apagada.");
    }

    public void mostrarEstado() {
        System.out.println("Lámpara: " + marca);
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
    }
}

*/