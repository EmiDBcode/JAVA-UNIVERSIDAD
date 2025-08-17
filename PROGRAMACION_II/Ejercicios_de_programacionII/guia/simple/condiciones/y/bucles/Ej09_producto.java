package guia.simple.condiciones.y.bucles;

import static java.util.function.Predicate.not;

public class Ej09_producto {
    static int cont;
    static int producto=1;

    public static void productoDeLosImpares (int numero){
        //--podemos usar un BUCLE FOR --------
        boolean condicion = false;
        // || PRACTICAMOS - while not condition : - SINTAXIS python ||
        while (!(condicion)){
            if (numero%2!=0){
                producto = producto*numero;
                cont++;
            }
            numero++;
            if (cont==10) condicion = true;
        }
        System.out.println("EL producto es: "+ producto);

    }
}
