package org.structure.implementation.dynamic;

import org.structure.definition.SetADT;

public class DynamicSetADT implements SetADT {

    @Override
    public boolean exist(int value) {
        return false;
    }

    @Override
    public int choose() {
        return 0;
    }

    @Override
    public void add(int value) {

    }

    @Override
    public void remove(int element) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
