package org.taller.Ejercicios;


//Ejercicio 63: Hospital
/*
 * Diseño de la clase:
 *
 * Atributos: nombre, ciudad, especialidades, capacidadCamas, camasOcupadas
 *
 * Métodos: admitirPaciente(String nombre), darDeAlta(String nombre), mostrarCapacidad()
 *
 * Objeto a construir:
 *   - Hospital hosp = new Hospital("Hospital General", "Bogotá", 200)
 *
 */

class Hospital {
    String nombre;
    String ciudad;
    int capacidadCamas;
    int camasOcupadas;

    void admitirPaciente(String nombrePaciente) {
        if (camasOcupadas < capacidadCamas) {
            camasOcupadas++;
            System.out.println(nombrePaciente + " admitido en " + nombre);
            System.out.println("Camas ocupadas: " + camasOcupadas + "/" + capacidadCamas);
        } else {
            System.out.println(nombre + " sin capacidad disponible.");
        }
    }

    void darDeAlta(String nombrePaciente) {
        if (camasOcupadas > 0) {
            camasOcupadas--;
            System.out.println(nombrePaciente + " fue dado/a de alta.");
            System.out.println("Camas ocupadas: " + camasOcupadas + "/" + capacidadCamas);
        }
    }

    void mostrarCapacidad() {
        System.out.println(nombre + " | Ciudad: " + ciudad);
        System.out.println("Camas: " + camasOcupadas + "/" + capacidadCamas);
    }
}
public class Ejercicio63 {

    public static void main(String[] args) {

        System.out.println("\n----------------------Hospital----------------------\n");
        Hospital hosp = new Hospital();
        hosp.nombre = "Hospital General";
        hosp.ciudad = "Bogotá";
        hosp.capacidadCamas = 200;
        System.out.println("\nCapacidad del hospital\n");
        hosp.mostrarCapacidad();
        System.out.println();
        System.out.println("Pacientes ingresados\n");
        hosp.admitirPaciente("Rosa Gómez");
        hosp.admitirPaciente("Tomás Ruiz");
        hosp.darDeAlta("Rosa Gómez");


    }
}
