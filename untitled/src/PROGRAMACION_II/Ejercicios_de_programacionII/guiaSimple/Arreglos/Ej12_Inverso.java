package guiaSimple.Arreglos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ej12_Inverso {

    static Scanner sc = new Scanner(System.in);
    static int[] lista = new int[5];
    static int[] lista_inversa = new int[5];

    public static void inverso (){
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Ingresar un numero: ");
            int numero = sc.nextInt();
            lista[i] = numero;
        }
        for (int i=lista.length-1, j=0; i>=0 ; i--,j++ ) {
            lista_inversa[j] = lista[i];
        }

        System.out.println("La lista original es: "+Arrays.toString(lista)+" y La lista inversa:"+Arrays.toString(lista_inversa));
    }
}
