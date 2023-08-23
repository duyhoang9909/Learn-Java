package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG {

    int test = 100;

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + 2*c;
    }

    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        int[] arrayInt = {2,3};
        GFG hello = new GFG();
        System.out.println(hello.test);
        System.out.println("double " + add(5,6));
        System.out.println("int " + add(1,2,3));
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(listInt);
    }
}
