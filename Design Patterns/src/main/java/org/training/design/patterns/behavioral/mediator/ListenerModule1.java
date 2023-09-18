package org.training.design.patterns.behavioral.mediator;

public class ListenerModule1 implements IListener{

    public ListenerModule1() {
        Mediator.getInstance().register("module1","gr1",this);
    }

    @Override
    public void handleMessage(Message message) {
        System.out.println("Module 1 mesajı aldı  : " + message);
    }
}
