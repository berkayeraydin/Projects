package org.training.design.patterns.creational.factory;

public interface IHello {

    String sayHello(String name);

    default void outHello(String name) {
        System.out.println(sayHello(name));
    }

    String desc();
}
