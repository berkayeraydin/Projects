package org.training.design.patterns.structural.decorator;

public class LiqueurDecorator extends AbstractBeverageDecorator {


    public LiqueurDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String contents() {
        return beverage.contents() + " Liqueur";
    }

    @Override
    public int price() {
        return beverage.price() + 7;
    }
}
