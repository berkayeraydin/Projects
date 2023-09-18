package org.training.java.advanced.collections;

import org.training.java.advanced.streams.Customer;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRun {
    public static void main(String[] args) {
         Set<String> mySet = new TreeSet<>();
        mySet.add("osman");
        mySet.add("ali");
        mySet.add("veli");

        mySet.add("osman");
        mySet.add("ali");
        mySet.add("veli");
        System.out.println(mySet);
        Set<Customer> customers = new HashSet<>();
        customers.add(new Customer("osman",
                                   "yay",
                                   200,
                                   100));
        customers.add(new Customer("osman",
                                   "yay",
                                   200,
                                   100));
        customers.add(new Customer("osman",
                                   "yay",
                                   200,
                                   100));
        System.out.println(customers);

        Set<String> strSet = new HashSet<>();

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
        }

        System.gc();

        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
        }

        long d = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            strSet.add("test" + i);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - d));

        d = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            strSet.contains("test" + i);
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - d));
        String s1;
        d = System.currentTimeMillis();
        for (String s : strSet) {
            s1 = s;
        }
        System.out.println("Iterator Delta : " + (System.currentTimeMillis() - d));

        d = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            strSet.remove("test" + i);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - d));

    }
}
