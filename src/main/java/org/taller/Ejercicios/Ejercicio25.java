package org.taller.Ejercicios;

import org.taller.Modelo.Libro;

public class Ejercicio25 {
    public static void main(String[] args) {

        // Objeto con constructor vacío
        Libro l1 = new Libro();
        l1.titulo = "1984";
        l1.autor = "George Orwell";
        l1.paginas = 328;

        // Objeto con constructor con parámetros
        Libro l2 = new Libro("Sapiens", "Yuval Noah Harari", 443);

        l1.mostrarInfo();
        l2.mostrarInfo();
    }
}