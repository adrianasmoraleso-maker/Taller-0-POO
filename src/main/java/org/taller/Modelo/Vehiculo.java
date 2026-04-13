package org.taller.Modelo;

    public class Vehiculo{
        public String marca;
        public String modelo;
        public int velocidadActual;

        public void mostrarEstado(){

            System.out.println("Marca del carro: "+ marca);
            System.out.println("Modelo del carro: "+ modelo);
            System.out.println("Velocidad actual: "+ velocidadActual + "km");
        }
        public void acelerar() {
            velocidadActual += 10;
            System.out.println("Acelerando... nueva velocidad: " + velocidadActual);
        }
       }
