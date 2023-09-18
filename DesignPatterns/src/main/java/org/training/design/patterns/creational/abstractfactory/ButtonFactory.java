package org.training.design.patterns.creational.abstractfactory;

public class ButtonFactory {

    public static IButton createButton(int templateColor){
        switch (templateColor){
            case 1:
                return new BlueButton();
            case 2:
            default:
                return new RedButton();
        }
    }
}
