package org.training.design.patterns.behavioral.visitor;

public class Keyboard implements ComputerPart {

    private int key = 4;

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
