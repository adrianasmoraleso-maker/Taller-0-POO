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

// ── Ejercicio 70: Explicación por escrito ────────────────────────
/*
 * Cuál fue la clase?
 *
 * La clase para la explicación de este ejercicio es: Pedido
 *
 * Cuáles fueron los objetos?
 *
 * Los objetos que se crearon a partir de esta clase fueron: p1 (Laura, $45.000), p2 (Carlos, $120.000),
 * p3 (Marcela, $75.000), p4 (Felipe, $200.000), p5 (Diana, $32.000)
 *
 *Cuáles fueron sus atributos?
 *
 * Se definieron los atributos de cada objeto como: numero (identificador único), cliente (nombre del comprador),
 * total (valor de la compra), estado (ciclo de vida del pedido).
 *
 *
 * Cuáles fueron sus comportamientos?
 *
 * Según los metodos de la clase pedido, estos fueron los siguientes: procesar() cambia el estado a "en proceso",
 * entregar() lo marca como entregado,mostrarPedido() imprime toda la información del pedido.
 */