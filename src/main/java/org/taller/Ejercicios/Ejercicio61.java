package org.taller.Ejercicios;


//Ejercicio 61: Docente
/*
 * Diseño:
 *
 * Se definieron primero los atributos: nombre, cedula, departamento, nivelAcademico y salario
 *
 * Luego, se crearon los métodos: mostrarInfo(), dictar(String materia) y recibirNomina()
 *
 * Los objetos que se piensan crear:
 *   - Docente d1 = new Docente("Luis Pérez", "CC 123", "Ingeniería", "Magíster", 4000000)
 *   - Docente d2 = new Docente("Ana Torres", "CC 456", "Ciencias", "Doctor", 5500000)
 */

class Docente {
    String nombre;
    String cedula;
    String departamento;
    String nivelAcademico;
    double salario;

    void mostrarInfo() {
        System.out.println("Docente: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Nivel: " + nivelAcademico);
        System.out.println("Salario: $" + salario);
    }

    void dictar(String materia) {
        System.out.println(nombre + " dicta la materia: " + materia);
    }

    void recibirNomina() {
        System.out.println(nombre + " recibió nomina de $" + salario);
    }
}

public class Ejercicio61 {

    public static void main(String[] args) {

        System.out.println("\n---Docentes--------------------------------------------------------\n");
        Docente d1 = new Docente();
        d1.nombre = "Luis Pérez";
        d1.cedula = "CC 11223344";
        d1.departamento = "Ingeniería de Sistemas";
        d1.nivelAcademico = "Magíster";
        d1.salario = 4000000;
        d1.mostrarInfo();
        d1.dictar("Programación Orientada a Objetos");
        d1.recibirNomina();
        System.out.println();
        Docente d2 = new Docente();
        d1.nombre = "Ana Torres";
        d1.cedula = "CC 55340782";
        d1.departamento = "Ciencias Exactas";
        d1.nivelAcademico = "Doctor";
        d1.salario = 5500000;
        d1.mostrarInfo();
        d1.dictar("Fisica I");
        d1.recibirNomina();
        System.out.println();

    }
}
