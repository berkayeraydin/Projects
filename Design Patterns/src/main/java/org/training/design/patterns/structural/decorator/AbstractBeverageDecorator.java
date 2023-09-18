package org.training.design.patterns.structural.decorator;

public abstract class AbstractBeverageDecorator extends Beverage {

    protected Beverage beverage;

    public AbstractBeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
