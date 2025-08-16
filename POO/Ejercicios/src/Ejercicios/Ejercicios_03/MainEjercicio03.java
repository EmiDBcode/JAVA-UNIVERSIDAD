package Ejercicios.Ejercicios_03;

import java.util.Scanner;

public class MainEjercicio03 {
    public static void main(String[] args) {

        //usamos la clase Scanenr para el input de datos
        Scanner sc = new Scanner(System.in);

        //print como en python
        System.out.printf("Ingresa el fabricante del motor: ");

        // input, cadena de texto
        String marca = sc.nextLine();

        //Creamos el contructor
        MotorDeClase m1 = new MotorDeClase (marca,350,5100 );
        MotorDeClase m2 = new MotorDeClase (" TIO-540", 20000 ,5100 );

        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
