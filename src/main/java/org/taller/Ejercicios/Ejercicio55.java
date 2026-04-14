package org.taller.Ejercicios;

class Reloj {
    int hora;
    int minuto;
    int segundo;

    void mostrarHora() {
        System.out.printf("Hora actual: %02d:%02d:%02d%n", hora, minuto, segundo);
    }
}

public class Ejercicio55 {


    public static void main(String[] args) {

        System.out.println("\n--------Reloj--------\n");
        Reloj reloj = new Reloj();
        reloj.hora = 14;
        reloj.minuto = 35;
        reloj.segundo = 7;
        reloj.mostrarHora();

    }
}