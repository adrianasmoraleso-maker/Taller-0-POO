package org.taller.Ejercicios;

class Tarea {
    String descripcion;
    boolean completada;
    String prioridad; // alta, media, baja

    void completar() {
        completada = true;
        System.out.println("Tarea '" + descripcion + "' completada.");
    }

    void mostrarTarea() {
        System.out.println("Tarea: " + descripcion + " | Prioridad: " + prioridad
                + " | Estado: " + (completada? "completada" : "incompleta"));
    }
}

public class Ejercicio67 {

    public static void main(String[] args) {

        System.out.println("\n----------------------------Lista de tareas----------------------------\n");
        Tarea t1 = new Tarea();
        t1.descripcion = "Lavar la ropa";
        t1.prioridad = "Media";
        t1.completada = false;
        System.out.println("\n-Tarea 1---------------------------------------------------------------\n");
        t1.mostrarTarea();
        t1.completar();

        System.out.println();
        Tarea t2 = new Tarea();
        t2.descripcion = "Alimentar al gato";
        t2.prioridad = "Media";
        t2.completada = false;
        System.out.println("\n-Tarea 2---------------------------------------------------------------\n");
        t2.mostrarTarea();
        t2.completar();

        System.out.println("\n========================================================================\n");

   }
}


