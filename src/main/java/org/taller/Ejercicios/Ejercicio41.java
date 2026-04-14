package org.taller.Ejercicios;

    class Empleado {
        String nombre;
        String cargo;
        double salario;

        void mostrarInfo() {
            System.out.println("Empleado: " + nombre);
            System.out.println("Cargo: " + cargo);
            System.out.println("Salario: $" + salario);
        }
    }

public class Ejercicio41 {

    public static void main(String[] args) {

        System.out.println("\n=== Empleado ===\n");
        Empleado emp1 = new Empleado();
        emp1.nombre = "Carlos Mendoza";
        emp1.cargo = "Desarrollador";
        emp1.salario = 3500000;
        emp1.mostrarInfo();
    }
}
    /*
     * Argumento:
     * Modelar Empleado con una clase y objetos es mucho mejor que usar variables
     * sueltas. Con variables sueltas se tendrían que definir: String nombreEmp1, nombreEmp2;
     * String cargoEmp1, cargoEmp2; double salarioEmp1, salarioEmp2; ... y así para
     * cada empleado. Con 50 empleados, el código sería inmanejable y propenso a errores.
     *
     * Con la clase Empleado, toda la información de una persona queda agrupada en un
     * solo objeto. Podemos crear todos los empleados que necesitemos con new Empleado(),
     * cada uno con sus propios datos, y pasarlos como parámetros a métodos, guardarlos
     * en colecciones, etc. El código es más legible, organizado y escalable.
     */