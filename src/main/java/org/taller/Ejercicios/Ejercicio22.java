package org.taller.Ejercicios;

import org.taller.Modelo.Libro;

public class Ejercicio22 {

    public static void main(String[] args) {

        System.out.println("\n=== Ejercicio 22: Cuatro objetos de Libro ===");

        Libro l1 = new Libro();
        l1.titulo = "Don Quijote";
        l1.autor = "Cervantes";
        l1.paginas = 863;

        Libro l2 = new Libro();
        l2.titulo = "Hamlet";
        l2.autor = "Shakespeare";
        l2.paginas = 180;

        Libro l3 = new Libro();
        l3.titulo = "El alquimista";
        l3.autor = "Paulo Coelho";
        l3.paginas = 208;

        Libro l4 = new Libro();
        l4.titulo = "Sapiens";
        l4.autor = "Yuval Noah Harari";
        l4.paginas = 443;

        l1.mostrarInfo();
        l2.mostrarInfo();
        l3.mostrarInfo();
        l4.mostrarInfo();
    }
}

    /*
     * Conclusion:
     * La clase Libro es la plantilla que define qué atributos y métodos tienen todos
     * los libros, pero no representa a ningún libro en particular. Es solo el molde.
     *
     * Los objetos l1, l2, l3 y l4 representan cada uno a un libro
     * real con valores específicos. Se crearon a partir del mismo molde, pero son
     * entidades independientes con datos propios. Esto es la esencia de la POO:
     * definir una vez la estructura y crear tantas instancias como se necesiten.
     */


