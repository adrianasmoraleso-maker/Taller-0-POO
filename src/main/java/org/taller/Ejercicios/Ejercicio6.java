package org.taller.Ejercicios;

import org.taller.Modelo.Estudiante;

public class Ejercicio6 {
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Juan Mendoza";
        estudiante1.codigo = 750252339;
        estudiante1.semestre = 4;

        estudiante1.mostrarInfo();
    }
}

// ── Ejercicio 19 ──────────────────────────────────────────────────
/*
 * ¿Por qué Estudiante es una clase y estudiante1 es un objeto?
 *
 * Estudiante es una clase porque esta es como un molde, o una plantilla, que define
 * cómo serán todos los estudiantes, es decir, qué atributos tendrán( en este caso: nombre, codigo,
 * semestre) y qué funciones podrán tener (mostrarInfo, cambiarSemestre).
 * La clase en sí no representa a ningún estudiante en específico; solo define la estructura.
 *
 * estudiante1 es un objeto porque es una instancia concreta creada a partir del molde estudiante.
 * Tiene valores reales asignados a sus atributos y ocupa espacio en la memoria.
 * Cuando escribí: Estudiante estudiante1 = new Estudiante();
 * se creo un objeto individual a partir del "molde" Estudiante.
 */