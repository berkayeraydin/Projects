package org.training.java.advanced.streams;

import java.util.*;

public class Streams2 {
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
        boolean allMatch = stringList.stream()
                                     .filter(s -> s.length() >= 4)
                                     .allMatch(s -> s.length() >= 5);

        boolean anyMatch = stringList.stream()
                                     .filter(s -> s.length() >= 4)
                                     .anyMatch(s -> s.length() >= 5);

        boolean noneMatch = stringList.stream()
                                      .filter(s -> s.length() >= 4)
                                      .noneMatch(s -> s.length() >= 5);

        Optional<String> first = stringList.stream()
                                           .filter(s -> s.length() >= 4)
                                           .findFirst();



    }
}
