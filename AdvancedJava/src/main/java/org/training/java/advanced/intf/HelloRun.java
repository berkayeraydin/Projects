package org.training.java.advanced.intf;

import java.util.Scanner;

public class HelloRun {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(HelloFactory.getMenu());
            int index = scanner.nextInt();
            IHello hello = HelloFactory.createHelloImpl(index);
            System.out.println(hello.sayHello("osman",
                                              "yaycıoğlu"));
        } catch (Exception exp) {
            exp.printStackTrace();
        }

    }

}
