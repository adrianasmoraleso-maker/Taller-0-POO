package org.taller.Ejercicios;

import org.taller.Modelo.CuentaBancaria;

public class Ejercicio10 {
    public static void main(String[] args){

        System.out.println("\nCuenta 1\n");
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = 801123456;
        cuenta1.titular = "Ana Pérez";
        cuenta1.saldo = 1500000;

        cuenta1.mostrarCuenta();

        System.out.println("\nCuenta 2\n");
        CuentaBancaria   cuenta2 = new CuentaBancaria();
        cuenta2.numero = 1025123523;
        cuenta2.titular = "Carlos López";
        cuenta2.saldo = 1500000;

        cuenta2.mostrarCuenta();
    }
}

// Ejercicio 21

/* Se modificaron los valores del saldo de las cuentas
 * para que fueran los mismos valores, y se mantuvieron
 * los valores de los nombres y numeros, para que fueran
 *distintos.
 */