package guia.simple.variables.y.condicionales;

import java.util.Scanner;

class MainGuiaSimpleTP extends javax.swing.JFrame {
    public static void main(String[] args) {

        // Mensaje que se vera pór pantalla
        System.out.println("Calcularemos el AREA de un circulo, para eso necesitamos el radio...");

        // Entrada por teclado
        System.out.print("Ingrese el RADIO : ");
        Scanner sc = new Scanner(System.in);
        int radio = (int) sc.nextDouble();

        // llamada de la funcion
        double resultado = Ej01_AreaCirculo.areaCirculo(radio);

        // Impresion
        System.out.printf("El area de nuestro circulo es de: " + resultado);

    }
}