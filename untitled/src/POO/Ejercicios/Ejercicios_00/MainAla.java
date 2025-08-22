/*
Crear la clase ala para un avion. Esta clase debe tener un atributos
como la envergadura, el color y el tipo de material (aluminio,compuesto, etc)
Un compartamiento comun de cualquier ola es "floap". Derrolla una clase de prueba
con un metodo "main" para contruir dos alas, usar las flap y muestra algunos de sus datos
en la consala
 */
package Ejercicios.Ejercicios_00;

public class MainAla {
    public static void main(String[] args) {
        Ala ala = new Ala("roja", 3.5, "aluminio");
        System.out.println("El ala tiene una envergadura de "
                + ala.envergadura + " metros, es de color "
                + ala.color + " y el material es " + ala.material + ".");
    }
}
