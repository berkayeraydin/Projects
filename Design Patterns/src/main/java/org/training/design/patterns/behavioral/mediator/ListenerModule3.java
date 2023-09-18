package org.training.design.patterns.behavioral.mediator;

public class ListenerModule3 implements IListener {
    public ListenerModule3() {
        Mediator.getInstance().register("module3","gr2",this);

    }

    @Override
    public void handleMessage(Message message) {
        System.out.println("Module 3 mesajı aldı  : " + message);
    }
}
