package Ejercicios.Ejercicios_03;

public class MotorDeClase {

    String marca;
    int hp;
    int empuje;

    public MotorDeClase(String marca, int hp, int empuje) {
        this.marca=marca;
        this.hp = hp;
        this.empuje = empuje;
    }

    @Override
    public String toString() {
        return "La marca del motor es: " + marca +
                ", tiene esta cantidad de caballos de fuerza: " + hp +
                " y el empuje de este motor es: " + empuje;
    }
}
