package org.taller.Modelo;

    public class CuentaBancaria{
        public int numero;
        public String titular;
        public int saldo;

        public void mostrarCuenta(){

            System.out.println("Numero de cuenta: "+ numero);
            System.out.println("Titular: "+ titular);
            System.out.println("Saldo: " + "$" + saldo);
        }
    }

