package org.taller.Ejercicios;

class Temperatura {
    double celsius;

    double convertirAFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }

    void mostrar() {
        System.out.println(celsius + "°C = " + convertirAFahrenheit() + "°F");
    }
}

public class Ejercicio56 {


    public static void main(String[] args) {


        System.out.println("\n=== Convertir Temperatura ===\n");
        Temperatura temp = new Temperatura();
        temp.celsius = 25;
        temp.mostrar();
        temp.celsius = 100;
        temp.mostrar();
    }
}