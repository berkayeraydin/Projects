package org.training.design.patterns.behavioral.visitor;

public class Monitor implements ComputerPart {

    private int color = 200;

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
