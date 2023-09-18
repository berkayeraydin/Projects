package org.training.java.advanced.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams3 {
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
        Stream<String> stream = stringList.stream();
        List<Customer> customerList = stringList.stream()
                                                .distinct()
                                                .sorted()
                                                .map(s -> new Customer(s,
                                                                       null,
                                                                       null,
                                                                       null))
                                                .filter(c -> c.getName()
                                                              .length() >= 5)
                                                .collect(Collectors.toList());

        int customerNameLength = stringList.stream()
                                           .map(s -> new Customer(s,
                                                                  null,
                                                                  null,
                                                                  null))
                                           .filter(c -> c.getName()
                                                         .length() >= 5)
                                           .reduce(0,
                                                   (i, c) -> i + c.getName()
                                                                  .length(),
                                                   (i1, i2) -> i1 + i2);

        List<Customer> customerList2 = stringList.stream()
                                                 .map(s -> new Customer(s,
                                                                        null,
                                                                        null,
                                                                        null))
                                                 .filter(c -> c.getName()
                                                               .length() >= 5)
                                                 .reduce(new ArrayList<Customer>(),
                                                         (a, c) -> {
                                                             a.add(c);
                                                             return a;
                                                         },
                                                         (a1, a2) -> {
                                                             a1.addAll(a2);
                                                             return a1;
                                                         });
        System.out.println(customerList2);

        IntSummaryStatistics collect = stringList.stream()
                                                 .distinct()
                                                 .sorted()
                                                 .map(s -> new Customer(s,
                                                                        null,
                                                                        null,
                                                                        null))
                                                 .filter(c -> c.getName()
                                                               .length() >= 5)
                                                 .collect(Collectors.summarizingInt(c -> c.getName()
                                                                                          .length()));
        IntSummaryStatistics intSummaryStatistics = stringList.stream()
                                                              .distinct()
                                                              .sorted()
                                                              .mapToInt(s -> s.length())
                                                              .summaryStatistics();
        System.out.println(collect);
    }
}
