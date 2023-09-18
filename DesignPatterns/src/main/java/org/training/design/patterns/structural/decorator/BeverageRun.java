package org.training.design.patterns.structural.decorator;

import java.util.Arrays;

public class BeverageRun {
    public static void main(String[] args) {
        Beverage beverage = new LiqueurDecorator(new CreamDecorator(new CoffeeBeverage()));
        System.out.println(beverage.contents() + " : " + beverage.price());

        beverage = new WatermelonDecorator(new LiqueurDecorator(new CreamDecorator(new AlcoholBeverage())));
        System.out.println(beverage.contents() + " : " + beverage.price());

        beverage = BeverageFactory.getCoffeeBeverage(2);
        System.out.println(beverage.contents() + " : " + beverage.price());

        beverage = BeverageFactory.createCoffeeBeverage(Arrays.asList(1,2,3,1,2));
        System.out.println(beverage.contents() + " : " + beverage.price());

    }
}
