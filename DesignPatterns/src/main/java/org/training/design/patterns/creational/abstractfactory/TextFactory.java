package org.training.design.patterns.creational.abstractfactory;

public class TextFactory {

    public static IText createText(int templateColor){
        switch (templateColor){
            case 1:
                return new BlueText();
            case 2:
            default:
                return new RedText();
        }
    }
}
