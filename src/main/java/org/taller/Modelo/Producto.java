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
    }

