package org.taller.Modelo;

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