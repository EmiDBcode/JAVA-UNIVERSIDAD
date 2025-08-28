package guiaSimple.Arreglos;

import org.example.Main;

import static guiaSimple.Arreglos.Ej13_intercalados.*;

public class MainGuiaSimpleTP_03 {
    public static void main(String[] args) {
        //---------------Ejercicio_12----------------------
        System.out.printf("Ingresara 5 digitos, ");
        Ej12_Inverso.inverso();
        //---------------Ejercicio_13-----------------------
        Ej13_intercalados intercalados = new Ej13_intercalados();

        intercalados.intercalados();
        System.out.printf(intercalados.toString());


    }




}
