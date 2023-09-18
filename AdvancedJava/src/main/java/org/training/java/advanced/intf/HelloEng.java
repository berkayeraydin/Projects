package org.training.java.advanced.intf;

public class HelloEng implements IHello {

    @Override
    public String sayHello(String name,
                           String surname) {
        return "Hi " + name + " " + surname;
    }

    @Override
    public String sayGoodBye(String name,
                             String surname) {
        return "bye bye " + name + " " + surname;
    }

    public String anotherHello(String name,
                               String surname) {
        return "Another Hello " + name + " " + surname;
    }
}
