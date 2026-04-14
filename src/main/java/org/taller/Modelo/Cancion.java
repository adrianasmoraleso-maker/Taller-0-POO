package org.taller.Modelo;

public class Cancion {
    public String titulo;
    public String artista;
    public int duracion; // en segundos

    public void mostrarInfo() {
        int min = duracion / 60;
        int seg = duracion % 60;
        System.out.println("Canción: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + min + "m " + seg + "s");
    }
}