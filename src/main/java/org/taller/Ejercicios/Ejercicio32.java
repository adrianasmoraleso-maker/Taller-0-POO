package org.taller.Ejercicios;

import org.taller.Modelo.Producto;

public class Ejercicio32 {
    public static void main(String[] args) {

        Producto p1 = Producto.crearProductoBasico("Cuaderno");

        Producto p2 = Producto.crearProductoBasico("Lapicero");

        p1.mostrarProducto();
        System.out.println();

        p2.mostrarProducto();
    }
}