package org.taller.Modelo;

public class Producto{
    public String nombre;
    public int precio;
    public int stock;

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
    }

