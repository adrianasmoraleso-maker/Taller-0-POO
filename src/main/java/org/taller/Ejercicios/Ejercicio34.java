package org.taller.Ejercicios;

import org.taller.Modelo.Libro;

public class Ejercicio34 {

    public static void main(String[] args) {
        System.out.println("\n=== Ejercicio 34: Libro original y copia ===\n");
        Libro original = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
        Libro copia = new Libro(original);  // constructor copia
        System.out.println("\nOriginal:\n");
        original.mostrarInfo();
        System.out.println("\nCopia:\n");
        copia.mostrarInfo();

        // Modificar la copia no afecta al original
        copia.titulo = "\nCopia modificada\n";
        System.out.println("\nTras modificar la copia:\n");
        System.out.println("Original: " + original.titulo);
        System.out.println("Copia: " + copia.titulo);
    }
}

