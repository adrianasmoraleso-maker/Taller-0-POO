package org.taller.Modelo;

public class Estudiante{
    public String nombre;
    public int codigo;
    public int semestre;

    public void mostrarInfo(){

        System.out.println("Nombre del estudiante: "+ nombre);
        System.out.println("Codigo: "+ codigo);
        System.out.println("Semestre: "+ semestre);
    }
}

