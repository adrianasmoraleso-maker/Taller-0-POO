package org.taller.Ejercicios;

class FacturaSimple {
    int numero;
    String cliente;
    double valor;

    void aplicarDescuento() {
        double descuento = valor * 0.10;
        valor -= descuento;
        System.out.println("Factura #" + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Descuento del 10% aplicado.");
        System.out.println("Valor final: $" + valor);
    }

    void mostrarFactura() {
        System.out.println("Factura #" + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor: $" + valor);
    }
}

public class Ejercicio52 {

    public static void main(String[] args) {

        System.out.println("\nFactura Simple\n");
        FacturaSimple fac = new FacturaSimple();
        fac.numero = 1001;
        fac.cliente = "Empresa XYZ";
        fac.valor = 200000;
        fac.mostrarFactura();
        System.out.println("\nFactura con descuento\n");
        fac.aplicarDescuento();

    }
}
