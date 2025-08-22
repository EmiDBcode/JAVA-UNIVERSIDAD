package guiaSimple.variablesYcondicionales;

public class Ej02_Iguales {

    //compara

    public static boolean comparaNumeros (int n1, int n2){

        if (n1==n2){
            System.out.println("El numero es igual");
            return true;
        }
        else{
            System.out.println("El numero no es igual");
            return false;
        }
    }
}
