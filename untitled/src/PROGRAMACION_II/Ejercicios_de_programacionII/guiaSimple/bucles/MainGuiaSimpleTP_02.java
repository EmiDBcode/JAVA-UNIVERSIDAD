package guiaSimple.bucles.;

import java.util.Scanner;

public class MainGuiaSimpleTP_02 {
    public static void main(String[] args) {

        //------- CONDICIONALES Y BUCLES ---------------

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

        //-----------EJERCICIO_09------------------------

        System.out.printf("Se tomara la primera entrada que hizo: "+ numero_00 );
        System.out.println("Se mostrara el producto de los 10 numeros impares, que seran los consecuentes al numero ingresado");
        Ej09_producto.productoDeLosImpares(numero_00);



        //-----------EJERCICIO_10-------------------------

        Ej10_SumaDeSueldos.suma();

        //-----------EJERCICIO_11-------------------------



        }

    }
}
