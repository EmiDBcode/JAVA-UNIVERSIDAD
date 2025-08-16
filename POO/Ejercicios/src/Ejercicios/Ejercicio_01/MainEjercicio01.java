package Ejercicios.Ejercicio_01;

import Ejercicios.Ejercicio_01.SistemaDeControlDeVuelo;

import java.util.Scanner;

public class MainEjercicio01 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tipo de Sistema: 1 (Manual) o 2 (Automatico) ");
        String tipoDeSistema = sc.nextLine();

        SistemaDeControlDeVuelo control = new SistemaDeControlDeVuelo(" Boing ",2,tipoDeSistema);
        System.out.println(control);

    }
}
