package org.structure.implementation.fixed;

import org.structure.definition.QueueADT;

public class StaticQueueADT implements QueueADT {
    @Override
    public int getElement() {
        return 0;
    }

    @Override
    public void add(int value) {

    }

    @Override
    public void remove() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
