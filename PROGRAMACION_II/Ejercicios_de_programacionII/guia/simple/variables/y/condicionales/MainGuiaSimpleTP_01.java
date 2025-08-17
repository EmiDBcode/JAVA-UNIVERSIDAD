package guia.simple.variables.y.condicionales;

import java.util.Scanner;

class MainGuiaSimpleTP_01 extends javax.swing.JFrame {
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
        boolean iguales = Ej02_Iguales.comparaNumeros(primer_numero,segundo_numero);

        //--------------------------------------------------------
        //----------------EJERCICIO_03----------------------------
        if (iguales){
            Ej03_Mayor.mayor(primer_numero,segundo_numero);
        }
        //---------------EJRERCICIO_04-----------------------------
        System.out.printf("Ingrese un numero entre 0 y 9999");
        Scanner num04 = new Scanner(System.in);
        int digito_numero = num04.nextInt();
        Ej04_Digitos.digito(digito_numero);

        //------------EJERCICIO_05-----------------------------

        Scanner nota_01 = new Scanner(System.in);
        System.out.println("Ingrese una nota: ");
        int nota_numero = nota_01.nextInt();
        Ej05_Nota.estadoDeAprobacion(nota_numero);

    }
}
