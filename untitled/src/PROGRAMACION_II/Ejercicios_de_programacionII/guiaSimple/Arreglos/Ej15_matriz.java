package guiaSimple.Arreglos;

public class Ej15_matriz {

    private final int[][] matriz = new int[4][4];

    // Constructor (sin 'void' y con el mismo nombre exacto de la clase)
    public Ej15_matriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;   // ejemplo de llenado
            }
        }
    }

    // Para poder imprimir con System.out.println(matriz)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //StringBuilder podés ir acumulando texto en el mismo objeto sin crear tantos temporales

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sb.append(matriz[i][j]).append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public boolean esSimetrica() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++)
            { // arriba de la diagonal
                if (matriz[i][j] != matriz[j][i]) return false;
            }
        }
        return true;
    }
}
