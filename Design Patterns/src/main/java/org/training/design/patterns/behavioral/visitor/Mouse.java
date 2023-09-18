package org.training.design.patterns.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mouse implements ComputerPart {

    private int x = 10;
    private int y = 20;


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
