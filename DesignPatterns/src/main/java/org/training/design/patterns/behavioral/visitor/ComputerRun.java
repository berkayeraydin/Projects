package org.training.design.patterns.behavioral.visitor;

import java.util.Arrays;

public class ComputerRun {
    public static void main(String[] args) {
        Computer computer = new Computer(Arrays.asList(new Mouse(),
                                                       new Keyboard(),
                                                       new Monitor()));
        MycomputerPartVisitor visitor = new MycomputerPartVisitor();
        computer.accept(visitor);
        MyComputerPartVisitorEx visitor2 = new MyComputerPartVisitorEx();
        computer.accept(visitor2);

    }

}
