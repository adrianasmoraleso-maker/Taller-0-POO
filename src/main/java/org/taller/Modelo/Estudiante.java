package org.taller.Modelo;

public class Estudiante{
    public String nombre;
    public int codigo;
    public int semestre;

    // Constructor vacío
    public Estudiante() {}

    // Constructor con nombre y código
   public Estudiante(String nombre, int codigo) {
       this.nombre = nombre;
       this.codigo = codigo;
       this.semestre = 1;
   }

    // Constructor con todos los parámetros
    public Estudiante(String nombre, int codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarInfo(){

        System.out.println("Nombre del estudiante: "+ nombre);
        System.out.println("Codigo: "+ codigo);
        System.out.println("Semestre: "+ semestre);
    }

    public void cambiarSemestre(int nuevoSemestre) {
        System.out.println(nombre + " pasa del semestre " + semestre + " al " + nuevoSemestre);
        semestre = nuevoSemestre;
    }
}

