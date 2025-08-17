package guia.simple.variables.y.condicionales;

public class Ej04_Digitos {

    static void digito (int numero){
        if (numero>0 && numero<=9) {
            System.out.printf(" El numero ingresado tiene un digito ");
        }
        else if ( numero>=10 && numero<=99){
            System.out.printf(" El numero ingresado tiene dos digitos ");
        }
        else if (numero>=100 && numero<=999){
            System.out.printf(" El numero ingresado tiene tres digitos ");
        }
        else if (numero>=1000 && numero<=9999){
            System.out.printf("El numero ingresado esta fuera del rango estipuladp ");
        }
        else{
            System.out.printf("Numero fuera del rango (0 - 9999)");
        }
    }
}
