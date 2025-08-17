package guia.simple.condiciones.y.bucles;

import java.util.Scanner;

public class Ej08_introducidos {
    static int cont;

    public static void introducidos (int numero){
        while (numero!=-1){
            cont=cont+1;

            Scanner sc=new Scanner(System.in);
            System.out.print("Ingrese un numero || -1 PARA FINALIZAR: ");
            numero= sc.nextInt();
        }
        System.out.println("Ingreso esta cantidad de digitos: "+ cont);
    }
}
