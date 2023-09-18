package org.training.java.advanced.intf;

public class HelloJp implements IHello {

    @Override
    public String sayHello(String name,
                           String surname) {
        return "Haa " + name + " " + surname;
    }

    @Override
    public String sayGoodBye(String name,
                             String surname) {
        return "kon " + name + " " + surname;
    }

}
