package org.training.design.patterns.creational.factory;

public class HelloTr implements IHello {

    @Override
    public String sayHello(String name) {
        return "Merhaba " + name;
    }

    @Override
    public String desc() {
        return "Turkish";
    }


}
