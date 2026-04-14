package org.taller.Ejercicios;

//Ejercicio 65: EquipoDeFutbol
/*
 * Diseño planteado:
 * Atributos: nombre, ciudad, entrenador, puntos y golesAFavor
 * Métodos: ganarPartido(), perderPartido(), empatar() y mostrarClasificacion()
 *
 * Objetos a construir:
 *   - EquipoDeFutbol eq1 = new EquipoDeFutbol("Atlético Nacional", "Medellín", "Juan Cruz")
 *   - EquipoDeFutbol eq2 = new EquipoDeFutbol("Millonarios", "Bogotá", "Alberto Gamero")
 */

class EquipoDeFutbol {
    String nombre;
    String ciudad;
    String entrenador;
    int puntos;
    int golesAFavor;

    void ganarPartido(int goles) {
        puntos += 3;
        golesAFavor += goles;
        System.out.println(nombre + " ganó. Puntos: " + puntos);
    }

    void empatar() {
        puntos += 1;
        System.out.println(nombre + " empató. Puntos: " + puntos);
    }

    void perderPartido() {
        System.out.println(nombre + " perdió. Puntos se mantienen en: " + puntos);
    }

    void mostrarClasificacion() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Entrenador: " + entrenador);
        System.out.println("Puntos: " + puntos);
        System.out.println("Goles: " + golesAFavor);
    }
}

public class Ejercicio65 {
    public static void main(String[] args) {

        System.out.println("\nEquipos de Fútbol\n");
        EquipoDeFutbol eq1 = new EquipoDeFutbol();
        eq1.nombre = "Atlético Nacional";
        eq1.ciudad = "Medellín";
        eq1.entrenador = "Juan Cruz";
        eq1.ganarPartido(3);
        eq1.empatar();
        eq1.perderPartido();
        System.out.println("\nInformacion Equipo\n");
        eq1.mostrarClasificacion();

        System.out.println("\n---------------------------------------------------------------------\n");
        EquipoDeFutbol eq2 = new EquipoDeFutbol();
        eq2.nombre = "Millonarios";
        eq2.ciudad = "Bogotá";
        eq2.entrenador = "Alberto Gamero";
        eq2.ganarPartido(2);
        eq2.empatar();
        eq2.perderPartido();
        System.out.println("\nInformacion Equipo\n");
        eq2.mostrarClasificacion();
    }
}
