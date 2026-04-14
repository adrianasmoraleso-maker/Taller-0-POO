package org.taller.Ejercicios;

class Proyecto {
    String titulo;
    String asignatura;
    double nota;
    boolean entregado;

    void entregar() {
        entregado = true;
        System.out.println("Proyecto: '" + titulo + "' entregado en " + asignatura);
    }

    void calificar(double calificacion) {
        nota = calificacion;
        System.out.println("Proyecto: '" + titulo + "' calificado con " + nota);
    }

    void mostrarInfo() {
        System.out.println("Proyecto: " + titulo);
        System.out.println( "Materia: " + asignatura);
        System.out.println("Nota: " + nota);
        System.out.println("Entregado: " + (entregado ? "Sí" : "No")); // Se agrego un operador ternario para convertir el booleano en"Sí" si el entregado es true, o "No" si es false
    }
}

public class Ejercicio66 {
    public static void main(String[] args) {

        System.out.println("\n----------------------------Proyectos académicos desarrollados----------------------------\n");
        Proyecto p1 = new Proyecto();
        p1.titulo = "Proyecto final de circuitos integrados";
        p1.asignatura = "Sistemas Digitales";
        p1.entregado = true;
        p1.entregar();
        p1.calificar(4.5);
        System.out.println("\n--------------------------------Estado final del proyecto--------------------------------\n");
        p1.mostrarInfo();

        System.out.println("\n=========================================================================================\n");

        Proyecto p2 = new Proyecto();
        p2.titulo = "Proyecto final de Base de Datos";
        p2.asignatura = "Base de Datos I";
        p2.entregado = true;
        p2.entregar();
        p2.calificar(5);
        System.out.println("\n--------------------------------Estado final del proyecto--------------------------------\n");
        p2.mostrarInfo();

        System.out.println("\n=========================================================================================\n");




    }
}
