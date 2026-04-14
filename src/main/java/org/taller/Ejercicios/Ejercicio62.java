package org.taller.Ejercicios;

//Ejercicio 62: Biblioteca
/*
 * Diseño planteado:
 *
 * Atributos: nombre, direccion, totalLibros y abierta
 * Métodos: abrir(), cerrar(), registrarLibro(String titulo), mostrarInfo()
 *
 * Posibles objetos a crear:
 *   - Biblioteca bib = new Biblioteca("Biblioteca Central", "Cra 5 # 10-20", 5000)
 *   - Biblioteca bib2 = new Biblioteca("Biblioteca Sur", "Cll 15 # 8-30", 1200)
 */
class Biblioteca {
    String nombre;
    String direccion;
    int totalLibros;
    boolean abierta;

    void abrir() {
        abierta = true;
        System.out.println(nombre + " está abierta.");
    }

    void cerrar() {
        abierta = false;
        System.out.println(nombre + " cerró sus puertas.");
    }

    void registrarLibro(String titulo) {
        totalLibros++;
        System.out.println("Libro '" + titulo + "' registrado en " + nombre);
        System.out.println("Total libros: " + totalLibros);
    }

    void mostrarInfo() {
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Libros: " + totalLibros);
        System.out.println("Estado: " + (abierta ? "Abierta" : "Cerrada"));
    }
}

public class Ejercicio62 {

    public static void main(String[] args) {
        System.out.println("\nBibliotecas registradas\n");
        Biblioteca bib = new Biblioteca();
        bib.nombre = "Biblioteca Central";
        bib.direccion = "Cra 5 # 10-20";
        bib.totalLibros = 4800;
        bib.abrir();
        bib.registrarLibro("Clean Code");

        System.out.println("\nInformacion sobre la Biblioteca\n");
        bib.mostrarInfo();
        System.out.println();
        bib.cerrar();

        System.out.println();
        Biblioteca bib2 = new Biblioteca();
        bib2.nombre = "Biblioteca Sur";
        bib2.direccion = "Cll 15 # 8-30";
        bib2.totalLibros = 1200;
        bib2.abrir();
        bib2.registrarLibro("Calculo volumen1");

        System.out.println("\nInformacion sobre la Biblioteca\n");
        bib2.mostrarInfo();
        System.out.println();
        bib2.cerrar();


    }
}
