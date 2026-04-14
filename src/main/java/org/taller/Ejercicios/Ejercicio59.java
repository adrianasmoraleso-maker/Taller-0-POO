package org.taller.Ejercicios;

class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    void activar() {
        activo = true;
        System.out.println("Usuario " + nombreUsuario + " ACTIVADO.");
    }

    void desactivar() {
        activo = false;
        System.out.println("Usuario " + nombreUsuario + " DESACTIVADO.");
    }
}

public class Ejercicio59 {

    public static void main(String[] args) {


        System.out.println("\nUsuario Sistema\n");
        UsuarioSistema usr = new UsuarioSistema();
        usr.nombreUsuario = "jdoe";
        usr.clave = "1234";
        usr.activar();
        usr.desactivar();
    }
}