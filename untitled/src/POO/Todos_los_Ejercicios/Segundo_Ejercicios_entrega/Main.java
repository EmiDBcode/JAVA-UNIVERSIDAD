package Todos_los_Ejercicios.Segundo_Ejercicios_entrega;
import Todos_los_Ejercicios.Segundo_Ejercicios_entrega.Televisor;

public class Main {
    public static void main(String[] args) {

        Pantalla panelCompartido = new Pantalla(55, 1440);

        Televisor tv1 = new Televisor("LG", "Curvo", 2023, "LCD", true, panelCompartido);
        Televisor tv2 = new Televisor("Samsung", "Plegable", 2024, "LED", true, panelCompartido);


        System.out.println(tv1); // APAGADO
        System.out.println(tv2); // APAGADO

        tv1.encender();
        System.out.println("tv1 encendido? " + tv1.isEncendido());
        System.out.println("tv2 encendido? " + tv2.isEncendido());

        // modifico el componente compartido
        panelCompartido.setResolucion(2160);

        // ambos reflejan el cambio por compartir la MISMA pantalla
        System.out.println(tv1);
        System.out.println(tv2);
    }
}
