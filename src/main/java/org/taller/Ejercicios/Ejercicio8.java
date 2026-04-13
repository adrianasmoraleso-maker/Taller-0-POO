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
