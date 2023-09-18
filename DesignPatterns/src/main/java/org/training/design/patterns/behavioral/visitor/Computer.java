package org.training.design.patterns.behavioral.visitor;

import java.util.List;

public class Computer implements ComputerPart {
    private List<ComputerPart> computerParts;

    public Computer(List<ComputerPart> computerParts) {
        this.computerParts = computerParts;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart:
             computerParts) {
            computerPart.accept(computerPartVisitor);
        }
    }

}
