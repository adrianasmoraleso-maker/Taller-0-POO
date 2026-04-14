package org.taller.Ejercicios;

class Semaforo {
    String colorActual;

    Semaforo() {
        colorActual = "Rojo";
    }

    void cambiarColor() {
        if (colorActual.equals("Rojo")) {
            colorActual = "Verde";
        } else if (colorActual.equals("Verde")) {
            colorActual = "Amarillo";
        } else {
            colorActual = "Rojo";
        }
        System.out.println("Color actual del semáforo: " + colorActual);
    }
}

public class Ejercicio54 {

    public static void main(String[] args) {

        System.out.println("\nSemáforo\n");
        Semaforo sem = new Semaforo();
        System.out.println("Estado inicial: " + sem.colorActual);
        sem.cambiarColor();
        sem.cambiarColor();
        sem.cambiarColor();
    }
}