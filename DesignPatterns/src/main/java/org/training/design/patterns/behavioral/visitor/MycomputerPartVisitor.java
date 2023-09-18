package org.training.design.patterns.behavioral.visitor;

public class MycomputerPartVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse o) {
        System.out.println("Mouse location : " + o.getX() + ":" + o.getY());
    }

    @Override
    public void visit(Keyboard o) {
        System.out.println("Keyboard last key : " + o.getKey() );
    }

    @Override
    public void visit(Monitor o) {
        System.out.println("Monitor color : " + o.getColor());
    }

}
