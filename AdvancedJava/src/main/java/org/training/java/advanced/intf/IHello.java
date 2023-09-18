package org.training.java.advanced.intf;

public interface IHello {

    public static final int HELLO_DEFAULT = 1;

    String str = "osman";

    String sayHello(String name,
                    String surname);

    String sayGoodBye(String name,
                      String surname);

    default void sayHelloOut(String name,
                             String surname) {
        System.out.println(sayHello(name,
                                    surname));
    }

    public static String covert(String str) {
        return str.toUpperCase();
    }

}
