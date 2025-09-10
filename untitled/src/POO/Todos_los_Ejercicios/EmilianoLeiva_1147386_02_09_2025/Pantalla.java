package Todos_los_Ejercicios.Segundo_Ejercicios_entrega;

public class Pantalla {
    private int pulgadas;
    private int resolucion; // 720, 1080, 1440, 2160...

    public Pantalla(int pulgadas, int resolucion) {
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
    }

    public int getPulgadas() { return pulgadas; }
    public void setPulgadas(int pulgadas) { this.pulgadas = pulgadas; }

    public int getResolucion() { return resolucion; }
    public void setResolucion(int resolucion) { this.resolucion = resolucion; }

    @Override
    public String toString() { return pulgadas + " \" " + resolucion + "p";
    }

}


