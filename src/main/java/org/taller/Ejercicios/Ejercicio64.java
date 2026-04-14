package org.taller.Ejercicios;

// ── Ejercicio 64: Tienda ──────────────────────────────────
/*
 * Diseño de la clase:
 *
 * Atributos definidos: nombre, propietario, totalVentas y abierta
 * Métodos creados: abrir(), cerrar(), registrarVenta(double valor) y mostrarVentas()
 *
 * Posibles objetos a cosntruir:
 *   - Tienda t1 = new Tienda("Papelería Luz", "Beatriz Mora")
 *   - Tienda t2 = new Tienda("Supermercado El Sol", "Hernando Castro")
 */
class Tienda {
    String nombre;
    String propietario;
    double totalVentas;
    boolean abierta;

    void abrir() {
        abierta = true;
        System.out.println("La tienda" + nombre + " abrió sus puertas.");
    }

    void cerrar() {
        abierta = false;
        System.out.println("La tienda " +nombre + " cerró. Ventas del día: $" + totalVentas);
    }

    void registrarVenta(double valor) {
        totalVentas += valor;
        System.out.println("Venta de $" + valor + " registrada.");
        System.out.println("Total: $" + totalVentas);
    }

    void mostrarVentas() {
        System.out.println("Tienda" + nombre + " | Propietario: " + propietario + " | Ventas: $" + totalVentas);
    }
}


public class Ejercicio64 {

    public static void main(String[] args) {


        System.out.println("\n-------------------------Tiendas Registradas-------------------------\n");
        Tienda t1 = new Tienda();
        t1.nombre = "Papelería Luz";
        t1.propietario = "Beatriz Mora";
        t1.abrir();
        t1.registrarVenta(45000);
        t1.registrarVenta(12500);
        System.out.println("\n-------------------------Informacion Tienda-------------------------\n");
        t1.mostrarVentas();
        System.out.println();
        t1.cerrar();

        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        Tienda t2 = new Tienda();
        t2.nombre = "Supermercado El Sol";
        t2.propietario = "Hernando Castro";
        t2.abrir();
        t2.registrarVenta(89000);
        t2.registrarVenta(20000);
        System.out.println("\n-------------------------Informacion Tienda-------------------------\n");
        t2.mostrarVentas();
        System.out.println();
        t2.cerrar();
    }
}