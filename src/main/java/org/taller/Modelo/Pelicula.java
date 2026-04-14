package org.taller.Modelo;

//Ejercicio 73: reescribir una clase usando constructor copia

public class Pelicula {
    public String nombre;
    public String genero;
    public int minutos;

    // Constructor normal
    public Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    // Constructor copia
    public Pelicula(Pelicula otra) {
        this.nombre = otra.nombre;
        this.genero = otra.genero;
        this.minutos = otra.minutos;
    }

    public void mostrarFicha() {
        System.out.println("Película: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + minutos + " min");
    }
}

//Código original

/*

public class Pelicula {
    public String nombre;
    public String genero;
    public int minutos;

    public void mostrarFicha() {
        System.out.println("Película: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + minutos + " min");
    }
}
*/
