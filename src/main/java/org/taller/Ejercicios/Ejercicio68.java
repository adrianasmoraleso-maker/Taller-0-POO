package org.taller.Ejercicios;

class Pedido {
    int numero;
    String cliente;
    double total;
    String estado; // pendiente, en proceso, entregado

    void procesar() {
        estado = "en proceso";
        System.out.println("Pedido #" + numero + " de " + cliente + " en proceso.");
    }

    void entregar() {
        estado = "entregado";
        System.out.println("Pedido #" + numero + " entregado a " + cliente);
    }

    void mostrarPedido() {
        System.out.println("Pedido #" + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Total: $" + total);
        System.out.println("Estado: " + estado);
    }
}
public class Ejercicio68 {
}
