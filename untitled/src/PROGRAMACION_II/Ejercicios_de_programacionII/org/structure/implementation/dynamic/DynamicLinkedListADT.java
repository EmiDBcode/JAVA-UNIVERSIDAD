import org.structure.definition.LinkedListADT;
import org.structure.extra.Node;
import org.Main;


class DynamicLinkedListADT implements LinkedListADT {
    private Node head ;
    private int size = 0;

    @Override
    public void add(int value) {
        Node nuevo = new Node (value);
        if (head == null || value == 0 ) {
            head = nuevo.getSiguiente();
            size++;
        } else {add(value);}
    }

    @Override
    public void insert(int index, int value) {
        Node nuevo = new Node (index,value);
        if ( index<0 || index>size ) {
            System.out.printf ("Indice fuera de rango ");
        }

        if (head == null) {
            head = nuevo.getSiguiente();
            size++;
        } else{
            Node actual=head;
            for (index = 0; index < size; index++) {
                actual=actual.getSiguiente();
            }
            size++;
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo.getSiguiente());
        }
    }

    @Override
    public void remove(int index) {
        if  (index<0 || index>size ) {
            System.out.printf("Indice fuera de rango ");
        }
        else {
            // Entiendo que de alguna forma debemos acceder
            // al nodo que queremos y para eso tendriamos
            //que hacer un recorrido
            Node node_actual = head;
            int i=0;
            while(i<index) {
                node_actual = node_actual.getSiguiente();
                i++;
            }
            size--;
        }
    }

    @Override
    public int get(int index) {
        if ( index<0 || index>size ) {throw new IndexOutOfBoundsException("Indice fuera de rango: " + index);

        }
        else {
            Node actual = head;
            int i = index;
            while (i<=size) {
                actual = actual.getSiguiente();
                i++;
            }
            return actual.getDato();


        }
    }

    @Override
    public int size() {
        return size ;
    }

    @Override
    public boolean isEmpty() {
        if (size!=0){
            return false;
        }
        else {
            return true;
        }
    }
}

//------------------------------------------
/*
private void add(Node node, int value) {
    if (node == null) {
        node = new Node (value);
    } else {
        add(node.siguiente,value);
    }

 */