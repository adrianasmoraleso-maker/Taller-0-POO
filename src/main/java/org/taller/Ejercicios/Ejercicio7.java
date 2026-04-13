package org.taller.Ejercicios;

import org.taller.Modelo.Vehiculo;

public class Ejercicio7 {
    public static void main(String[] args){

        System.out.println("\nEstado vehiculo 1\n");
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Porsche";
        vehiculo1.modelo = "911 GT3";
        vehiculo1.velocidadActual = 311;
        vehiculo1.mostrarEstado();

        System.out.println("\nEstado vehiculo 2\n");
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "BMW";
        vehiculo2.modelo = "M2 Coupé Premium 2026";
        vehiculo2.velocidadActual = 250;
        vehiculo2.mostrarEstado();
    }
}
