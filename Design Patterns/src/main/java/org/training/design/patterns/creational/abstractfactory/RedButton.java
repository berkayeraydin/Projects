package org.training.design.patterns.creational.abstractfactory;

public class RedButton implements IButton {

    @Override
    public void press() {
        System.out.println("Red button pressed");
    }
}
