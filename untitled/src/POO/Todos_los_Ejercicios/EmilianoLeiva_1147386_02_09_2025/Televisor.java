package Todos_los_Ejercicios.Segundo_Ejercicios_entrega;

public class Televisor {
    private String marca, modelo, tipo;
    private int anio;
    private boolean smart;
    private boolean encendido = false;
    private Pantalla pantalla;

    public Televisor(String marca, String modelo, int anio, String tipo,
                     boolean smart, Pantalla pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.smart = smart;
        this.pantalla = pantalla; // referencia compartible
    }

    // --- comportamiento de encendido ---
    public void encender() { encendido = true; }
    public void apagar()   { encendido = false; }
    public void toggle()   { encendido = !encendido; }
    public boolean isEncendido() { return encendido; }

    // getter/setter de componentes
    public Pantalla getPantalla() { return pantalla; }
    public void setPantalla(Pantalla p) { this.pantalla = p; }

    @Override
    public String toString() {
        return "Televisor" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", tipo='" + tipo + '\'' +
                ", smart=" + smart +
                ", estado=" + (encendido ? "ENCENDIDO" : "APAGADO") +
                ", pantalla=" + pantalla;
    }
}


