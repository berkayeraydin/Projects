package org.training.java.advanced.streams;

import java.util.*;

public class Streams1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("osman",
                                                "ali",
                                                "veli",
                                                "mehmet",
                                                "mahmut",
                                                "osman",
                                                "osman",
                                                "veli",
                                                "mahmut");
        // New way
        stringList.parallelStream()
                  .skip(1)
                  .limit(10)
                  .peek(s -> System.out.println("Before sorted *" + Thread.currentThread()
                                                                         .getName() + " data : " + s))
                  .sorted()
                  .distinct()
                  .peek(s -> System.out.println("Before Filter1 *" + Thread.currentThread()
                                                                         .getName() + " data : " + s))
                  .filter(s -> s.length() >= 5)
                  .peek(s -> System.out.println("Before Filter2 *" + Thread.currentThread()
                                                                         .getName() + " data : " + s))
                  .filter(s -> s.length() <= 15)
                  .peek(s -> System.out.println("Before ForEach *" + Thread.currentThread()
                                                                         .getName() + " data : " + s))
                  .forEach(System.out::println);

        // Old way
        Set<String> stringSet = new TreeSet<>();
        for (String str : stringList) {
            if (str.length() >= 5) {
                stringSet.add(str);
            }
        }
        stringSet.forEach(System.out::println);
        System.out.println("-------------");


    }
}
