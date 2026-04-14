package org.taller.Ejercicios;

class Curso {
    String nombre;
    String docente;
    int creditos;

    void mostrarCurso() {
        System.out.println("Curso: " + nombre);
        System.out.println("Docente: " + docente);
        System.out.println("Créditos: " + creditos);
    }
}

public class Ejercicio42 {

    public static void main(String[] args) {

        System.out.println("\n=== Objetos de Curso ===\n");
        Curso c1 = new Curso();
        c1.nombre = "Programación Orientada a Objetos";
        c1.docente = "Prof. Ramírez";
        c1.creditos = 3;

        Curso c2 = new Curso();
        c2.nombre = "Bases de Datos";
        c2.docente = "Prof. Suárez";
        c2.creditos = 4;

        c1.mostrarCurso();
        c2.mostrarCurso();
    }
}
    /*
     * Argumento:
     * Aunque c1 y c2 tienen datos completamente diferentes (distinto nombre, docente
     * y créditos), ambos pertenecen a la misma clase Curso. Esto es posible porque
     * la clase define la esytructura (qué atributos y métodos existen), no los valores.
     * Podemos decir que ambos son "del mismo tipo" porque se crearon con el mismo
     * molde, aunque representen entidades del mundo real distintas.
     */

