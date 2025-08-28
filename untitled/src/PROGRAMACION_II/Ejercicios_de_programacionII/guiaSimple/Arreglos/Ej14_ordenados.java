package guiaSimple.Arreglos;

public class Ej14_ordenados {
    int [] lista = {1,2,3,4,5,6,7,8,9,10};
    boolean condition = false;
    int i ; int tag ;

    public void ordenados () {
        while (!(condition)) {

            if (lista[i] < lista[i + 1]) {
                i++;
                if (i == lista.length) {
                    tag=1;
                    condition = true;
                }
            }
            else if (lista[i] > lista[i + 1]) {
                i++;
                if (i == lista.length) {
                    tag=2;
                    condition = true;
                }
            }
            else {
                tag=3;
                condition = true;
            }
        }
        if (tag==1){
            System.out.printf("La lista esta ordenada de forma asendente");
        }
        else if (tag==2){
            System.out.printf("La lista esta ordenada de forma desendente");
        }
        else {
            System.out.printf("La lista no esta ordenada");
        }
        }
    }
