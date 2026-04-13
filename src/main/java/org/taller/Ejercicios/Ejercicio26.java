package org.taller.Ejercicios;

import org.taller.Modelo.Producto;
public class Ejercicio26 {
    public static void main(String[] args) {

        // Objeto con constructor vacío
        Producto p1 = new Producto();
        p1.nombre = "Jabón de lavar ropa";
        p1.precio = 5000;
        p1.stock = 40;

        // Objeto con constructor con parámetros
        Producto p2 = new Producto("Leche chocolatada", 3500, 20);

        p1.mostrarProducto();
        p2.mostrarProducto();
    }
}