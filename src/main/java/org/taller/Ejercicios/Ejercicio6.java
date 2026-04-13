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