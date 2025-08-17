package guia.simple.variables.y.condicionales;

import java.util.Scanner;

class MainGuiaSimpleTP extends javax.swing.JFrame {
    public static void main(String[] args) {

        //------------------------------------------------------
        //-----------EJERCICIO_01-------------------------------

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

        //-------------------------------------------------------
        //-------------EJERCICIO_02------------------------------
        //ingresamos numeros por teclado
        System.out.print("\n"+"Ingrese el primer número: ");
        int primer_numero = sc.nextInt();

        System.out.print("\n"+"Ingrese el segundo número: ");
        int segundo_numero = sc.nextInt();

        //Llamada de nuestra funcion, con entrada de valores
        Ej02_Iguales.comparaNumeros(primer_numero,segundo_numero);







    }
}