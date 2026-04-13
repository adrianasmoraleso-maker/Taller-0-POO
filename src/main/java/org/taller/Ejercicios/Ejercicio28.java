package org.taller.Ejercicios;

import org.taller.Modelo.CuentaBancaria;
public class Ejercicio28 {
    public static void main(String[] args) {

        System.out.println("\n=== Ejercicio 28: Tres cuentas con constructor parametrizado ===");
        CuentaBancaria cuenta1 = new CuentaBancaria(1010012602, "Laura Martínez", 500000);
        CuentaBancaria cuenta2 = new CuentaBancaria(1010027303, "Andrés Ramos", 1200000);
        CuentaBancaria cuenta3 = new CuentaBancaria(1010034515, "Sofía Jiménez", 0);
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
        cuenta3.mostrarCuenta();
    }
}
