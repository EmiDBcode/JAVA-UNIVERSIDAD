package guiaSimple.variablesYcondicionales;

public class Ej05_Nota {

    public static void estadoDeAprobacion(int nota){
        if (nota > 0 && nota <= 3) {
            System.out.println("Insufieciente");
        }
        else if (nota > 3 && nota <= 6){
            System.out.println("suficiente");
        }
        else if  (nota > 6 && nota <= 10){
            System.out.println("Bien");
        }
        else {
            System.out.println("La nota ingresada esta fuera del rango");
        }
    }
}
