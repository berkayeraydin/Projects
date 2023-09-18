package org.training.design.patterns.creational.factory;

public class HelloEng implements IHello {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String desc() {
        return "English";
    }


}
