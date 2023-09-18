package org.training.design.patterns.behavioral.chainofresponsibility;

import java.util.Scanner;

public class NumberCheckRun {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Sayı giriniz : ");
            int num = scanner.nextInt();
//            if (num < 0) {
//                System.out.println("sayı 0 dan küçük");
//            } else if (num >= 0 && num < 10) {
//                System.out.println("sayı 0 ile 10 arasında");
//            } else if (num >= 10 && num < 100) {
//                System.out.println("sayı 10 ile 100 arasında");
//            } else if (num >= 100) {
//                System.out.println("sayı 100 den büyük");
//            }
            ICheckNumber checkNumber = new CheckNumberImpl(0,
                                                           null,
                                                           new CheckNumberImpl(0,
                                                                               10,
                                                                               new CheckNumberImpl(10,
                                                                                                   100,
                                                                                                   new CheckNumberImpl(null,
                                                                                                                       100,
                                                                                                                       null))));
            checkNumber.check(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
