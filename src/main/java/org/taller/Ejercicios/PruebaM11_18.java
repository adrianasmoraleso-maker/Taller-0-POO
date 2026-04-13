package org.taller.Ejercicios;

import org.taller.Modelo.Vehiculo;
import org.taller.Modelo.CuentaBancaria;
import org.taller.Modelo.Producto;
import org.taller.Modelo.Estudiante;
import org.taller.Modelo.Mascota;

public class PruebaM11_18 {
    public static void main(String[] args) {
        System.out.println("\n=== Prueba Ejercicio 11 y 12: Vehiculo ===\n");
        Vehiculo v = new Vehiculo();
        v.marca = "Toyota";
        v.modelo = "Corolla";
        v.velocidadActual = 0;
        v.acelerar();
        v.acelerar();
        v.frenar();
        v.frenar();
        v.frenar(); // prueba para qeu el valor no quede negativo

        System.out.println("\n=== Ejercicio 13 y 14: CuentaBancaria ===\n");
        CuentaBancaria c = new CuentaBancaria();
        c.numero = 3052455;
        c.titular = "María García";
        c.saldo = 100000;
        c.consignar(50000);
        c.retirar(30000);
        c.retirar(200000); // saldo insuficiente

        System.out.println("\n=== Ejercicio 15 y 16: Producto ===\n");
        Producto p = new Producto();
        p.nombre = "Cuaderno";
        p.precio = 5000;
        p.stock = 10;
        p.vender(3);
        p.vender(20); // sin stock suficiente
        p.reabastecer(15);

        System.out.println("\n=== Ejercicio 17: Estudiante ===\n");
        Estudiante e = new Estudiante();
        e.nombre = "Pedro Torres";
        e.codigo = 750250017;
        e.semestre = 1;
        e.cambiarSemestre(2);

        System.out.println("\n=== Ejercicio 18: Mascota ===\n");
        Mascota m = new Mascota();
        m.nombre = "Max";
        m.especie = "Perro";
        m.edad = 3;
        m.cumplirAnios();
    }
}
