package org.training.design.patterns.structural.decorator;

public class CoffeeBeverage extends Beverage {

    @Override
    public int price() {
        return 30;
    }

    @Override
    public String contents() {
        return "Coffee";
    }
}
