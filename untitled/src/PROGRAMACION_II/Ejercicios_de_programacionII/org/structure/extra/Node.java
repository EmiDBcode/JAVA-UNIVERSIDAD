package org.structure.extra;

public class Node {
    private int dato;   // podria ser un objeto, pero en este caso lo hacemos con unnumero entero
    public Node siguiente; // El puntero
    int index=0;

    // ----  CONTRUCTOR -----
    public Node (int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    //----------------------------
    public Node (int index,int dato){

        this.index= index;
        this.dato = dato;
        this.siguiente = null ;
    }
    //-------Getter-----------------------
    public int getDato() {
        return dato;
    }
    public Node getSiguiente() {
        return siguiente;
    }

    //--------Setter----------------------
    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }

}

