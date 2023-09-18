package org.training.design.patterns.creational.factory;

import java.util.Scanner;

public class HelloEngine {

    public void run() {
        String[] str = new String[5];
        try (Scanner scanner = new Scanner(System.in)) {
            HelloFactory.showMenu();
            System.out.println("seçiminiz:");
            int i = scanner.nextInt();
            IHello hello = HelloFactory.createHello(i);
            System.out.println("isminiz : ");
            String s = scanner.next();
            System.out.println(hello.sayHello(s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
