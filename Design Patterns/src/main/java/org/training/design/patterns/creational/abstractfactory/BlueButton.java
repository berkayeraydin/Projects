package org.training.design.patterns.creational.abstractfactory;

public class BlueButton implements IButton {

    @Override
    public void press() {
        System.out.println("Blue button pressed");
    }
}
