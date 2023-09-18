package org.training.design.patterns.creational.abstractfactory;

public class AbstractFactoryRun {
    public static void main(String[] args) {
        IButton iButton = ButtonFactory.createButton(1);
        IText iText = TextFactory.createText(1);
        iButton.press();
        System.out.println(iText.getText());

        IWidgetFactory widgetFactory = WidgetFactory.getWidgetFactory(1);
        IButton button = widgetFactory.getButton();
        IText text = widgetFactory.getText();
        button.press();
        System.out.println(text.getText());
    }
}
