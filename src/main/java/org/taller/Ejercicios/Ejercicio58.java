package org.taller.Ejercicios;

class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    double calcularValorTotal() {
        return cantidad * precioUnitario;
    }

    void mostrarItem() {
        System.out.println("Item: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("P.Unit: $" + precioUnitario);
        System.out.println("Total: $" + calcularValorTotal());
    }
}

public class Ejercicio58 {

    public static void main(String[] args) {


        System.out.println("\n=== Inventario Item ===\n");
        InventarioItem item = new InventarioItem();
        item.nombre = "Monitor";
        item.cantidad = 5;
        item.precioUnitario = 850000;
        item.mostrarItem();


    }
}
