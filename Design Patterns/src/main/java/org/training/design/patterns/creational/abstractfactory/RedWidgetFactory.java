package org.training.design.patterns.creational.abstractfactory;

public class RedWidgetFactory implements IWidgetFactory{
    @Override
    public IButton getButton() {
        return new RedButton();
    }

    @Override
    public IText getText() {
        return new RedText();
    }
}
