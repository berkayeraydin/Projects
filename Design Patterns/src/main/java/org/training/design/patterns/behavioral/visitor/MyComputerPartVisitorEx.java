package org.training.design.patterns.behavioral.visitor;

public class MyComputerPartVisitorEx implements ComputerPartVisitor {
    @Override
    public void visit(Mouse o) {
        System.out.println("EX Mouse location : " + o.getX() + ":" + o.getY());
    }

    @Override
    public void visit(Keyboard o) {
        System.out.println("EX Keyboard last key : " + o.getKey() );
    }

    @Override
    public void visit(Monitor o) {
        System.out.println("EX Monitor color : " + o.getColor());
    }

}
