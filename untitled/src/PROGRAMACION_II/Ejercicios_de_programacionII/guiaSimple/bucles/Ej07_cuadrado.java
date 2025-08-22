package guiaSimple.bucles;

import java.util.Scanner;

public class Ej07_cuadrado {

    static void cuadrado(int numero){

        // --- inicio del bucle -----

        while (numero!=-1){
            int cuadrado=numero*numero;
            System.out.println("El numero que ingreso, es el: "+numero+" que al cuadrado, es igual a: "+cuadrado);

            // ----- Seccion del corte -----
            //---mediante el ingreso de un dato ----

            Scanner sc = new Scanner(System.in);
            System.out.printf("Ingrese otro numero, o -1 PARA TERMINAR: ");
            numero= sc.nextInt();
        }
        System.out.println("A finalizado el programa con EXITO");
    }
}
