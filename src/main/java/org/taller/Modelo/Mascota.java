package org.taller.Modelo;

    public class Mascota{
        public String nombre;
        public String especie;
        public int edad;

        public void mostrarMascota(){

            System.out.println("Nombre de la mascota: "+ nombre);
            System.out.println("Especie: "+ especie);
            System.out.println("Edad: "+ edad);
        }
        public void cumplirAnios() {
            edad++;
            System.out.println(nombre + " cumplió un año más. Ahora tiene " + edad + " años.");
        }
    }