package org.training.java.advanced.generics;

import org.training.java.advanced.composition.usage.Car;
import org.training.java.advanced.intf.IHello;
import org.training.java.advanced.lambdas.IProcess;

public class GenericHelloHolder<A extends Car & IHello & IProcess> {

    private A value;

    public void show(){
        value.forward(100);
        value.process("test",100);
        value.sayGoodBye("osman","yaycıoğlu");
        System.out.println(value.sayHello("osman","yaycıoğlu"));
    }

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }
}
