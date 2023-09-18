package org.training.design.patterns.structural.decorator;

import java.util.List;

public class BeverageFactory {

    public static Beverage getCoffeeBeverage(int menuIndex) {
        switch (menuIndex) {
            case 1:
                return new LiqueurDecorator(new CreamDecorator(new CoffeeBeverage()));
            case 2:
                return new LiqueurDecorator(new CoffeeBeverage());
            case 3:
                return new WatermelonDecorator(new LiqueurDecorator(new CreamDecorator(new CoffeeBeverage())));
            default:
                return new CoffeeBeverage();
        }
    }

    public static Beverage createCoffeeBeverage(List<Integer> beverageContents) {
        Beverage beverage = new CoffeeBeverage();
        for (Integer i :
                beverageContents) {
            switch (i) {
                case 1:
                    beverage = new CreamDecorator(beverage);
                    break;
                case 2:
                    beverage = new LiqueurDecorator(beverage);
                    break;
                case 3:
                    beverage = new WatermelonDecorator(beverage);
                    break;
                default:
                    break;
            }
        }
        return beverage;
    }
}