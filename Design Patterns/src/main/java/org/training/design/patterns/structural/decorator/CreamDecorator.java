package org.training.design.patterns.structural.decorator;

public class CreamDecorator extends AbstractBeverageDecorator {


    public CreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String contents() {
        return beverage.contents() + " Cream";
    }

    @Override
    public int price() {
        return beverage.price() + 8;
    }
}
