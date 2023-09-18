package org.training.java.advanced.intf;

public class HelloTr implements IHello {

    @Override
    public String sayHello(String name,
                           String surname) {
        return "Selam " + name + " " + surname;
    }

    @Override
    public String sayGoodBye(String name,
                             String surname) {
        return "Güle güle " + name + " " + surname;
    }

}
