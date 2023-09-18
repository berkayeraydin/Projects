package org.training.java.advanced.intf;

public abstract class AbstractHello implements IHello {

    private String str;

    public AbstractHello(String str) {
        this.str = str;
    }

    @Override
    public String sayGoodBye(String name,
                             String surname) {
        return str + " " + name + " " + surname;
    }
}

