package org.taller.Modelo;

public class Libro {
    public String titulo;
    public String autor;
    public int paginas;

    // Constructor vacío (Ejercicio 23)
    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
}

