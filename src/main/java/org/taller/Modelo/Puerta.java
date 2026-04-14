package org.taller.Modelo;

//Ejercicio72: reescribir una clase usando método fabrica

public class Puerta {
    public String material;
    public boolean abierta;

    // Constructor privado: solo se puede crear mediante el método fábrica
    private Puerta(String material, boolean abierta) {
        this.material = material;
        this.abierta = abierta;
    }

    // Método fábrica estático
    public static Puerta crearPuerta(String material) {
        return new Puerta(material, false); // toda puerta nueva empieza cerrada
    }

    public void abrir() {
        abierta = true;
        System.out.println("Puerta de " + material + " abierta.");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("Puerta de " + material + " cerrada.");
    }

    public void mostrarEstado() {
        System.out.println("Puerta: " + material);
        System.out.println("Estado: " + (abierta ? "Abierta" : "Cerrada"));
    }
}



//Código original
/*
public class Puerta {
    public String material;
    public boolean abierta;

    public void abrir() {
        abierta = true;
        System.out.println("Puerta de " + material + " abierta.");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("Puerta de " + material + " cerrada.");
    }

    public void mostrarEstado() {
        System.out.println("Puerta: " + material);
        System.out.println("Estado: " + (abierta ? "Abierta" : "Cerrada"));
    }
}

 */