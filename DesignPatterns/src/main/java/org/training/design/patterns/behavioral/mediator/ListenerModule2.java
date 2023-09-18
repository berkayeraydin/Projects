package org.training.design.patterns.behavioral.mediator;

public class ListenerModule2 implements IListener {
    public ListenerModule2() {
        Mediator.getInstance().register("module2","gr1",this);


    }

    @Override
    public void handleMessage(Message message) {
        System.out.println("Module 2 mesajı aldı  : " + message);
    }
}
