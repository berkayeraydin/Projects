package org.training.design.patterns.creational.abstractfactory;

public class BlueWidgetFactory implements IWidgetFactory{
    @Override
    public IButton getButton() {
        return new BlueButton();
    }

    @Override
    public IText getText() {
        return new BlueText();
    }
}
