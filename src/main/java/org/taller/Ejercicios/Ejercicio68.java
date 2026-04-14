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

    public static void main(String[] args) {

    //Ejercicio 69: Cinco objetos de Pedido
        System.out.println("------------------------------------Pedidos registrados------------------------------------");

    Pedido p1 = new Pedido();
    p1.numero = 1; p1.cliente = "Laura"; p1.total = 45000; p1.estado = "pendiente";

    Pedido p2 = new Pedido();
    p2.numero = 2; p2.cliente = "Carlos"; p2.total = 120000; p2.estado = "pendiente";

    Pedido p3 = new Pedido();
    p3.numero = 3; p3.cliente = "Marcela"; p3.total = 75000; p3.estado = "pendiente";

    Pedido p4 = new Pedido();
    p4.numero = 4; p4.cliente = "Felipe"; p4.total = 200000; p4.estado = "pendiente";

    Pedido p5 = new Pedido();
    p5.numero = 5; p5.cliente = "Diana"; p5.total = 32000; p5.estado = "pendiente";

        p1.procesar();
        p1.entregar();
        System.out.println();
        p2.procesar();

        System.out.println();
        p1.mostrarPedido();
        System.out.println();
        p2.mostrarPedido();
        System.out.println();
        p3.mostrarPedido();
        System.out.println();
        p4.mostrarPedido();
        System.out.println();
        p5.mostrarPedido();
}
}
