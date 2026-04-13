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

        public void consignar(double valor) {
            saldo += valor;
            System.out.println("Consignación de $" + valor + ". Nuevo saldo: $" + saldo);
        }
        public void retirar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Retiro de $" + valor + ". Nuevo saldo: $" + saldo);
            } else {
                System.out.println("Saldo insuficiente para retirar $" + valor);
            }
        }
    }


