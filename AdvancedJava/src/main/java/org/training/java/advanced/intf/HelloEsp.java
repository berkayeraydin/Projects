package org.training.java.advanced.intf;

public class HelloEsp implements IHello {

    @Override
    public String sayHello(String name,
                           String surname) {
        return "Ola " + name + " " + surname;
    }

    @Override
    public String sayGoodBye(String name,
                             String surname) {
        return "adios " + name + " " + surname;
    }

}
