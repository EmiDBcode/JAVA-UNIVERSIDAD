package guia.simple.condiciones.y.bucles;

import java.util.Scanner;

public class MainGuiaSimpleTP_02 {
    public static void main(String[] args) {

        //----------------Ejercicio_07------------------

        Scanner num_00 = new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        int numero_00 = num_00.nextInt();
        Ej07_cuadrado.cuadrado(numero_00);

        //------------EJERCICIO_08-----------------------
        Scanner num_01 = new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        int numero_01 = num_01.nextInt();
        Ej08_introducidos.introducidos(numero_01);



    }
}
