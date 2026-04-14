package org.taller.Ejercicios;

class Computador {
    String marca;
    String procesador;
    int ram;

    void mostrarEspecificaciones() {
        System.out.println("Computador: " + marca);
        System.out.println("CPU: " + procesador);
        System.out.println("RAM: " + ram + "GB");
    }
}

public class Ejercicio43 {

    public static void main(String[] args) {
        System.out.println("\n=== Computador ===\n");
        Computador pc = new Computador();
        pc.marca = "Lenovo";
        pc.procesador = "Intel i7";
        pc.ram = 16;
        pc.mostrarEspecificaciones();
    }
}

/*
 * Diferencia entre plano conceptual y máquina concreta:
 *
 * La clase Computador es el plano conceptual: es como los planos de un
 * arquitecto o el diseño técnico de un ingeniero. Define qué características
 * tendrá todo computador (marca, procesador, RAM) y qué puede hacer
 * (mostrarEspecificaciones). Es una abstracción que no existe físicamente.
 *
 * El objeto pc por otro lado, es la máquina concreta: es la realización física del plano.
 * Tiene valores reales (Lenovo, i7, 16GB), ocupa espacio en memoria y puede
 * ejecutar comportamientos reales. Así como del mismo plano se pueden construir
 * múltiples máquinas, de la misma clase se pueden crear múltiples objetos.
 */