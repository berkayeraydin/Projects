package org.training.design.patterns.creational.factory;

public class HelloCh implements IHello {

    @Override
    public String sayHello(String name) {
        return "dkfj " + name;
    }

    @Override
    public String desc() {
        return "Chinese";
    }


}
