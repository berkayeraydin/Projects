package org.training.java.advanced.intf;

public class HelloConcrete extends AbstractHello {

    public HelloConcrete() {
        super("osman");
    }

    @Override
    public String sayHello(String name,
                           String surname) {
        return "Hello";
    }
}
