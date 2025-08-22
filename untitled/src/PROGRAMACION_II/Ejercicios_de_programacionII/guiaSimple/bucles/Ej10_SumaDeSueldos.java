package guiaSimple.bucles;

import java.util.Scanner;

public class Ej10_SumaDeSueldos {


    public static void suma() {
        int total = 0;
        Scanner num = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Ingrese un numero: ");
            int numero = num.nextInt();
            total += numero;
        }
        System.out.printf("Total: %d", total);


        }
    }
}

