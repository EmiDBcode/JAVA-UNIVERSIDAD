package GuiaDeEjerciciosPracticosEstrcuturas;

public class MainGuiaDeEjerciciosPracticosEstructuras {
    public static void main(String[] args) {

        TDAListaEj01 lista = new  TDAListaEj01();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(50);
        lista.add(60);
        lista.add(70);
        lista.add(80);
        lista.add(90);
        lista.add(100);

        lista.imprimir();
        TDAListaEj01 invertida = lista.invertir();
        invertida.imprimir();

    }
}
