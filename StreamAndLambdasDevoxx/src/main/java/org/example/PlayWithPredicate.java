package org.example;

import org.example.utils.Predicate;

import java.util.Objects;

public class PlayWithPredicate {

    public static void main(String[] args) {

        Predicate<String> p = s -> s.isEmpty();
        Predicate<String> pNot = p.negate(); // s -> !s.isEmpty()
                                             // !s.isEmpty(): test() for pNot

        System.out.println("For Hello = " + pNot.test("Hello")); // p.negate().test(t)
        System.out.println("For Empty = " + pNot.test(""));

        Predicate<String> p1 = Objects::nonNull;
        Predicate<String> p2 = String::isEmpty;
        Predicate<String> p3 = p1.and(p2);
        p3.test("Hello");

        System.out.println("For null = " + p3.test(null));

        Predicate<String> p11 = s -> s.length() == 4;
        Predicate<String> p12 = s -> s.startsWith("J");

        Predicate<String> p13 = p11.xOr(p12);

        System.out.println("For True = " + p13.test("True"));
        System.out.println("For Julia = " + p13.test("Julia"));
        System.out.println("For Java = " + p13.test("Java"));
    }
}
