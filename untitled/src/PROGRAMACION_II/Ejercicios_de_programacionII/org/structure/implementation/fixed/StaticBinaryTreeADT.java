package org.structure.implementation.fixed;

import org.structure.definition.BinaryTreeADT;

public class StaticBinaryTreeADT implements BinaryTreeADT {
    @Override
    public int getRoot() {
        return 0;
    }

    @Override
    public BinaryTreeADT getLeft() {
        return null;
    }

    @Override
    public BinaryTreeADT getRight() {
        return null;
    }

    @Override
    public void add(int value) {

    }

    @Override
    public void remove(int value) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
