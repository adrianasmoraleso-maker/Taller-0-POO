package org.taller.Ejercicios;

class Paciente {
    String nombre;
    int edad;
    String diagnostico;

    void mostrarFicha() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Diagnóstico: " + diagnostico);
    }
}

public class Ejercicio44 {
    public static void main(String[] args) {
        System.out.println("\n=== Paciente ===\n");
        Paciente p = new Paciente();
        p.nombre = "Rosa Elena Gómez";
        p.edad = 45;
        p.diagnostico = "Hipertensión leve";
        p.mostrarFicha();
    }
}

/*
 * ¿"Crear un paciente" e "instanciar la clase Paciente" son lo mismo?
 *
 * Practicamente hablando, ambos hacen referencia al mismo evento técnico,
 * pero pedagógicamente hablando, son ideas distintas:
 *
 * "Crear un paciente" es el concepto del dominio del problema, es decir,
 * lo que se considera como el mundo real, registrar a una persona en
 * el sistema hospitalario, de darle existencia como entidad en nuestra aplicación.
 *
 * "Instanciar la clase Paciente" es el concepto técnico de Java, que significa
 * ejecutar la instrucción new Paciente(), reservar memoria, invocar el
 * constructor y obtener una referencia al objeto.
 *
 * La distinción importa porque nos enseña a pensar en dos niveles: el nivel
 * del problema (qué estamos modelando) y el nivel de la solución (cómo lo
 * implementamos en código). Un buen programador debe dominar ambos.
 */
