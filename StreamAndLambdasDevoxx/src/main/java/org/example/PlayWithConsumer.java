package org.example;


import org.example.utils.Consumer;

import java.util.ArrayList;
import java.util.List;

public class PlayWithConsumer {
    public static void main(String[] args) {

        Consumer<String> consumer = (String t) -> {
            System.out.println(120);
            System.out.println(t);
        };

        consumer.accept("Hello Lambda");

        System.out.println();
        System.out.println("Method reference");

        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("Method reference test");

        Consumer<List<String>> c1 = list -> list.add("one");
        Consumer<List<String>> c2 = list -> list.add("two");
        Consumer<List<String>> c3 = c1.andThen(c2);

        List<String> strings = new ArrayList<>();
        strings.add("zero");

        System.out.println();
        System.out.println("Test Consumer 2");
        c3.accept(strings);
        System.out.println("strings: " + strings);
    }
}
