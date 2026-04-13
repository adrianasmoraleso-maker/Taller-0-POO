package org.taller.Ejercicios;

import org.taller.Modelo.Producto;
public class Ejercicio8 {
    public static void main(String[] args){

        System.out.println("\n======================================PRODUCTOS DISPONIBLES======================================\n");

        System.out.println("\n==Producto 1=============================================\n");
        Producto producto1 = new Producto();
        producto1.nombre = "Salsa de Tomate La favorita";
        producto1.precio = 3000;
        producto1.stock = 40;
        producto1.mostrarProducto();

        System.out.println("\n==Producto 2=============================================\n");
        Producto producto2 = new Producto();
        producto2.nombre = "Pasta La Italiana";
        producto2.precio = 2500;
        producto2.stock = 55;
        producto2.mostrarProducto();

        System.out.println("\n==Producto 3=============================================\n");
        Producto producto3 = new Producto();
        producto3.nombre = "Queso Mozarella La Andina";
        producto3.precio = 7000;
        producto3.stock = 90;
        producto3.mostrarProducto();

        System.out.println("\n=========================================================\n");

    }
}

//Ejercicio 20

/*
 * ¿Qué comparten y en qué se diferencian los 3 objetos creados?
 *
 * Lo que comparten:
 * - La estructura definida por la clase Producto (tiene los mismos atributos: nombre, precio, stock).
 * - El comportamiento: todos pueden invocar mostrarProducto().
 * - El tipo: los tres son de tipo Producto.
 *
 * SE DIFERENCIAN:
 * - Los valores de sus atributos son distintos (nombre, precio y stock diferentes).
 * - Ocupan diferentes espacios en memoria (son referencias independientes).
 * - Representan entidades del mundo real completamente distintas.
 */
