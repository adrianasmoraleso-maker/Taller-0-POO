package org.taller.Modelo;

public class Producto{
    public String nombre;
    public int precio;
    public int stock;

    //Constructor vacío (Ejercicio 26)
    public Producto() {

    }

    // Constructor con parámetros
    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public void mostrarProducto(){

            System.out.println("Nombre del producto: "+ nombre);
            System.out.println("Precio: "+ "$" + precio);
            System.out.println("Stock: "+ stock);
        }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Vendidos " + cantidad + " de " + nombre + ". Stock restante: " + stock);
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades.");
        }
    }
   public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Reabastecidos " + cantidad + " de " + nombre + ". Stock total: " + stock);
    }
}


