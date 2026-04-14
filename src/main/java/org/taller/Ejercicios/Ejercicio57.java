package org.taller.Ejercicios;

class NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    double calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3;
    }

    void mostrarNota() {
        System.out.printf("Asignatura: %s | Definitiva: %.2f%n", asignatura, calcularDefinitiva());
    }

}
    public class Ejercicio57 {

        public static void main(String[] args) {

            System.out.println("\nNota Académica\n");
            NotaAcademica nota = new NotaAcademica();
            nota.asignatura = "Calculo";
            nota.nota1 = 4.2;
            nota.nota2 = 3.8;
            nota.nota3 = 4.5;
            nota.mostrarNota();

        }
    }


