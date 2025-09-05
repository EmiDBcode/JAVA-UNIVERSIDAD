package guiaSimple.Arreglos;

public class MainGuiaSimpleTP_03 {
    public static void main(String[] args) {
        //---------------Ejercicio_12----------------------
        System.out.printf("Ingresara 5 digitos, ");
        Ej12_Inverso.inverso();
        //---------------Ejercicio_13-----------------------
        Ej13_intercalados intercalados = new Ej13_intercalados();

        intercalados.intercalados();
        System.out.printf(intercalados.toString());

        //-------------Ejercicio_14----------------------------

        Ej13_intercalados ordenados = new Ej13_intercalados();
        System.out.printf(ordenados.toString());
        //-----------Ejercicio_15--------------------------

        Ej15_matriz m = new Ej15_matriz();
        System.out.println(m);                   // usa toString()
        System.out.println(m.esSimetrica() ?
                "La matriz es simétrica" : "La matriz NO es simétrica");;


    }




}
