package guiaSimple.Arreglos;

import java.util.Arrays;

public class Ej13_intercalados {
    int[] lista = {1,2,3,4,5,6,7,8,9,10} ;
    int[] lista_intercalados = new int[10];
    int i = 0 ; int j = lista.length-1; int k = 0;
    boolean flag = false;boolean cond =true;
    int contador = 0 ;

    public void intercalados () {
        while (!(flag)){
            if (cond==true){
                lista_intercalados[i]=lista[k];
                cond =false;
                contador++; i++; k++;
            }
            else {
                lista_intercalados[i] = lista[j];
                cond =true;
                contador++;i++;j--;
            }
            if (contador==lista.length){
                flag = true;
            }
        }
        System.out.printf(Arrays.toString(lista_intercalados));
        }

    }





