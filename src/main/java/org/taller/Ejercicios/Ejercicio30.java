package org.taller.Ejercicios;

import org.taller.Modelo.Estudiante;

public class Ejercicio30 {
    public static void main(String[] args) {

        // Constructor vacío
        Estudiante e1 = new Estudiante();
        e1.nombre = "Laura Pérez";
        e1.codigo = 750252345;
        e1.semestre = 2;

        // Constructor con nombre y código
        Estudiante e2 = new Estudiante("Carlos Gómez", 750267890);
        // semestre queda en 1 por defecto

        // Constructor completo
        Estudiante e3 = new Estudiante("Ana Torres", 750211223, 5);

        // Mostrar información
        e1.mostrarInfo();
        System.out.println();

        e2.mostrarInfo();
        System.out.println();

        e3.mostrarInfo();
    }
}