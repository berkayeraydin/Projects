package org.training.design.patterns.creational.abstractfactory;

public class WidgetFactory {

    public static IWidgetFactory getWidgetFactory(int colorTemplate){
        switch (colorTemplate){
            case 1 :
                return new BlueWidgetFactory();
            case 2:
            default:
                return new RedWidgetFactory();

        }
    }
}
