package org.training.java.advanced.generics;

import org.training.java.advanced.composition.usage.Car;
import org.training.java.advanced.intf.IHello;
import org.training.java.advanced.lambdas.IProcess;
import org.training.java.advanced.streams.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodGenericRun {

    public static void main(String[] args) {
        showString(new Customer("osman2",
                                "yay2",
                                200,
                                100));
        showString2("osman");
        showString2(new StringBuilder(100).append("deneme")
                                          .append("xyz"));
        showString3(new Customer("osman2",
                                 "yay2",
                                 200,
                                 100));
        List<String> stringList = new ArrayList<>();
        List<?> objectList = new ArrayList<String>();
        List<?> objectList2 = stringList;
        List<? extends CharSequence> charSequences = new ArrayList<String>();

        String str = process(i -> " deneme " + i,
                             100);

        Customer customer = process(s -> new Customer(s,
                                                      null,
                                                      null,
                                                      null),
                                    "osman");
    }

    public static <T> String showString(T value) {
        return value.toString();
    }

    public static <T extends CharSequence> String showString2(T value) {
        return value.toString();
    }

    public static <T extends Customer> String showString3(T value) {
        return value.toString();
    }

    public static <T extends Car & IHello & IProcess> String showString4(T value) {
        return value.toString();
    }

    public static <T> T showString4(String str,
                                    Class<T> clazz) throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }

    public static <T, R> R process(Function<T, R> function,
                                   T t) {
        return function.apply(t);
    }

}
