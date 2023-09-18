package org.training.design.patterns.structural.decorator;

public class WatermelonDecorator extends AbstractBeverageDecorator {

    public WatermelonDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String contents() {
        return beverage.contents() + " watermelon";
    }

    @Override
    public int price() {
        return beverage.price() + 5;
    }
}
