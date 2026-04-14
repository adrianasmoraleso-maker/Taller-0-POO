package org.taller.Ejercicios;

class Rectangulo {
    double base;
    double altura;

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return 2 * (base + altura);
    }

    void mostrarResultados() {
        System.out.println("Rectángulo Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea() );
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

public class Ejercicio51 {

    public static void main(String[] args) {

        System.out.println("\nRectángulo\n");
        Rectangulo rect = new Rectangulo();
        rect.base = 8;
        rect.altura = 4;
        rect.mostrarResultados();

    }
}
