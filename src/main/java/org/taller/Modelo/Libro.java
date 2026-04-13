package org.taller.Modelo;

public class Libro {
    public String titulo;
    public String autor;
    public int paginas;

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
}