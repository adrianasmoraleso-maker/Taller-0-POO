package org.taller.Ejercicios;

// Bloque I: Ejercicios de lectura y corrección

// Ejercicios 45 al 50

    public class correccionEjercicios45_50{

        // ── Ejercicio 45: Método fuera de la clase
        /*
         * CÓDIGO INCORRECTO:
         *
         * class Animal {
         *     String nombre;
         * }
         *
         * void hacerSonido() {           // Esto produce un Error: el método está fuera de la clase
         *     System.out.println("...");
         * }
         *
         * Código corregido: el método debe estar DENTRO de las llaves de la clase
         */
        static class Animal {
            String nombre;

            void hacerSonido() {         // Clase correcta: el método está dentro de la clase
                System.out.println(nombre + " hace un sonido.");
            }
        }

        // ── Ejercicio 46: Falta el nombre de la clase
        /*
         * CÓDIGO INCORRECTO:
         *
         * class {                        // Error: falta el nombre de la clase
         *     String color;
         * }
         *
         * Código Corregido: toda clase debe tener un nombre después de la palabra class.
         */
        static class Circulo {           // Forma correcta: nombre "Circulo" agregado
            String color;
            double radio;
        }

        // ── Ejercicio 47: Objeto usado sin haberse creado
        /*
         * Código incorrecto:
         *
         * Estudiante est;                // solo declaración, sin new
         * est.mostrarInfo();             // NullPointerException: el objeto nunca fue creado
         *
         * Código corregido: siempre usar new para crear el objeto antes de usarlo
         */
        static class Estudiante {
            String nombre = "Sin nombre";
            void mostrarInfo() { System.out.println("Estudiante: " + nombre); }
        }

        // ── Ejercicio 48: Confusión entre atributos y variables locales
        /*
         * Código incorrecto:
         *
         * class Rectangulo {
         *     void calcularArea() {
         *         int base = 5;          // estas son variables LOCALES al método,
         *         int altura = 3;        // no atributos del objeto
         *         System.out.println(base * altura);
         *     }
         *     void mostrar() {
         *         System.out.println(base); // ERROR: la base no existe aquí, es local
         *     }
         * }
         *
         * Código corregido: los datos que definen al objeto deben ser atributos de clase.
         */
        static class Rectangulo {
            int base;      // atributos de instancia: visibles en todos los métodos
            int altura;

            void calcularArea() {
                System.out.println("Área: " + (base * altura));
            }

            void mostrar() {
                System.out.println("Base: " + base + " | Altura: " + altura);
            }
        }

        // ── Ejercicio 49: Un objeto accede a atributos de otro sin referencia
        /*
         * Código incorrecto:
         *
         * class Persona {
         *     String nombre;
         *     void saludar() {
         *         System.out.println("Hola, " + nombre2); //  ¿quién es nombre2?
         *     }
         * }
         *
         * Código corregido: para acceder a datos de otro objeto se necesita una
         * referencia explícita al mismo.
         */
        static class Persona {
            String nombre;

            void saludar(Persona otra) {   //recibe referencia al otro objeto
                System.out.println("Hola " + otra.nombre + ", yo soy " + this.nombre);
            }
        }

        // ── Ejercicio 50: Clase creada pero objeto nunca construido en main
        /*
         * Código incorrecto:
         *
         * class Vehiculo { String marca; }
         *
         * public class Main {
         *     public static void main(String[] args) {
         *         // nunca se usa new Vehiculo(), el objeto nunca existe
         *         System.out.println("Programa terminado");
         *     }
         * }
         *
         * Código corregido: se debe usar new para construir el objeto en main.
         */
        static class Vehiculo {
            String marca;
            void mostrar() { System.out.println("Vehículo: " + marca); }
        }

        // ── Main: demostración de los códigos corregidos
        public static void main(String[] args) {

            System.out.println("\nEjercicio 45: Método dentro de la clase\n");
            Animal a = new Animal();
            a.nombre = "Perro";
            a.hacerSonido();

            System.out.println("\nEjercicio 46: Clase con nombre\n");
            Circulo c = new Circulo();
            c.color = "Rojo";
            c.radio = 5.0;
            System.out.println("Círculo " + c.color + " de radio " + c.radio);

            System.out.println("\nEjercicio 47: Objeto creado antes de usarse\n");
            Estudiante est = new Estudiante(); // new antes de llamar al método
            est.mostrarInfo();

            System.out.println("\nEjercicio 48: Atributos en lugar de variables locales\n");
            Rectangulo r = new Rectangulo();
            r.base = 5;
            r.altura = 3;
            r.calcularArea();
            r.mostrar();

            System.out.println("\nEjercicio 49: Referencia correcta a otro objeto\n");
            Persona p1 = new Persona();
            p1.nombre = "Ana";
            Persona p2 = new Persona();
            p2.nombre = "Luis";
            p1.saludar(p2); // p1 saluda a p2 con referencia explícita

            System.out.println("\nEjercicio 50: Objeto construido en main\n");
            Vehiculo v = new Vehiculo(); //objeto creado con new
            v.marca = "Chevrolet";
            v.mostrar();
        }
    }
