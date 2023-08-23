package org.example;

import java.util.*;
import java.util.stream.Stream;

public class ThisKeywordExample {
    private int a;
    public ThisKeywordExample() {
        System.out.println("call empty method");
    }
    public ThisKeywordExample(int a) {
        this();
        this.a = a;
    }
    void show() {
        System.out.println(this.a);
    }

    public static void main(String[] args) {

        Comparator c=Comparator.nullsFirst(Comparator.naturalOrder());
        TreeMap tm=new TreeMap(c);
        tm.put(null, "hello");
        System.out.println(tm.values());


        String obj = null;
        System.out.println(obj .length());

        int a = 10 / 0;

        Stream

    }
}
