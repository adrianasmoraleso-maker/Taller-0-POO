package org.taller.Ejercicios;

import org.taller.Modelo.Mascota;

public class Ejercicio9 {
    public static void main(String[] args){

        System.out.println("\nEstado Mascota\n");
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Luna";
        mascota1.especie = "Perro";
        mascota1.edad = 2;

        System.out.println("\nEstado inicial:\n");
        mascota1.mostrarMascota();

        mascota1.edad = 3;
        System.out.println("\nDespués del primer cambio:\n");
        mascota1.mostrarMascota();

        mascota1.edad = 5;
        System.out.println("\nDespués del segundo cambio:\n");
        mascota1.mostrarMascota();
    }
}
