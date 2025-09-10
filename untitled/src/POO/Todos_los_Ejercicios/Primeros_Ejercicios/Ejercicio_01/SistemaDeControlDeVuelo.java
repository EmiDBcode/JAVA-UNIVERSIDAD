package Ejercicios.Ejercicio_01;

public class SistemaDeControlDeVuelo {
    //atributos en CamelCase
    private String fabricante ;
    private int modos;
    private String tipoDeSistema;

    public SistemaDeControlDeVuelo (String fabricante, int modos, String tipoDeSistema) {
        this.fabricante=fabricante;
        this.modos=modos;
        this.tipoDeSistema=tipoDeSistema;
        }

    @Override
    public String toString() {
        return "Fabricante" + fabricante +
                "\nModos" + modos +
                "\nTipo de Sistemas" + tipoDeSistema;
    }
}
