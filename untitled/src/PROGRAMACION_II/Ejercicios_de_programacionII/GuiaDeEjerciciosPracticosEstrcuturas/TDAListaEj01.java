package GuiaDeEjerciciosPracticosEstrcuturas;


public class TDAListaEj01 {
    private Node head;

    public TDAListaEj01() {
        head = null;
    }

    // Agrega al final
    public void add(int data) {
        Node nuevo = new Node(data, null);
        if (head == null) {
            head = nuevo;
        } else {
            Node actual = head;
            // avanzo mientras haya "siguiente"
            while (actual.getNext() != null) {
                actual = actual.getNext();  // <— ESTO es tu “i++”
            }
            actual.setNext(nuevo);
        }
    }

    public void imprimir() {
        Node aux = head;
        while (aux != null) {
            System.out.print(aux.getData() + " -> ");
            aux = aux.getNext();           // “avanzo”
        }
        System.out.println("null");
    }

    // Devuelve una NUEVA lista en orden inverso
    public TDAListaEj01 invertir() {
        TDAListaEj01 invertida = new TDAListaEj01();
        Node actual = head;
        while (actual != null) {
            Node nuevo = new Node(actual.getData(), null);
            // INSERTAR AL INICIO de la lista "invertida"
            nuevo.setNext(invertida.head); // el nuevo apunta al viejo primero
            invertida.head = nuevo;        // ahora el nuevo es el primero
            actual = actual.getNext();     // sigo avanzando en la original
        }
        return invertida;
    }
}