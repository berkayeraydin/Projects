package org.training.design.patterns.structural.decorator;

public class AlcoholBeverage extends Beverage {

    @Override
    public int price() {
        return 40;
    }

    @Override
    public String contents() {
        return "Alcohol";
    }
}
