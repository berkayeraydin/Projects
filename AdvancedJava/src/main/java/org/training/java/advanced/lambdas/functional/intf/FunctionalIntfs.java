package org.training.java.advanced.lambdas.functional.intf;

import java.util.Comparator;
import java.util.function.*;

public class FunctionalIntfs {
    public static void main(String[] args) {
        // Consumer Grubu
        Consumer<String> consumer1 = k -> System.out.println("sonuç : " + k);
        consumer1.accept("deneme");
        Consumer<Integer> consumer2 = k -> System.out.println("sonuç : " + (k + 100));
        consumer2.accept(15);

        IntConsumer intConsumer = System.out::println;
        LongConsumer longConsumer = System.out::println;
        DoubleConsumer doubleConsumer = System.out::println;

        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println(s + " " + i);

        // Function Grubu

        Function<String, Integer> function1 = Integer::parseInt;
        Integer apply = function1.apply("12020");
        Function<String, Integer> function2 = s -> s.length();
        Function<String, Integer> function3 = String::length;

        IntToLongFunction intToLongFunction = i -> (long) i;

        BiFunction<String, Integer, String> biFunction = (s, i) -> s + " " + i;

        BinaryOperator<String> binaryOperator = (s1,s2) ->  s1 + " " + s2;
        BiFunction<String,String,String> binaryOperator2 = (s1,s2) ->  s1 + " " + s2;

        UnaryOperator<String> unaryOperator = s -> s + "  " + s;
        Function<String,String> unaryOperator2 = s -> s + "  " + s;

        // Predicate Grubu

        Predicate<String> predicate1 = s -> s.length() > 10;
        if (predicate1.test("osman")) {
            System.out.println("geçti");
        } else {
            System.out.println("geçmedi");
        }

        IntPredicate intPredicate = i -> i < 20;
        Predicate<Integer> integerPredicate = i -> i < 20;
        LongPredicate longPredicate = l -> l < 30L;

        BiPredicate<String,String> biPredicate = (s1,s2) -> s1.length() > s2.length();

        // Supplier Grup
        Supplier<String> supplier1 = () -> "osman";

        IntSupplier intSupplier = () -> 100;
        LongSupplier longSupplier = () -> 100L;
        DoubleSupplier doubleSupplier = () -> 100D;

        Comparator<String> comparator = (s1,s2) -> s1.compareTo(s2);


    }
}
