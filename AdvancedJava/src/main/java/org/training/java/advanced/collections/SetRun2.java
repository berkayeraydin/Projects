package org.training.java.advanced.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetRun2 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");
        set1.add("5");
        set1.add("6");

        Set<String> set2 = new TreeSet<>();
        set2.add("4");
        set2.add("5");
        set2.add("6");
        set2.add("7");
        set2.add("8");
        set2.add("9");

        // Birleşim
        // set1.addAll(set2);
        // Kesişim
         set1.retainAll(set2);
        // Fark
        // set1.removeAll(set2);
        System.out.println(set1);
    }
}
