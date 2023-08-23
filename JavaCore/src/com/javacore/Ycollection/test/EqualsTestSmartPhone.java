package com.javacore.Ycollection.test;

import com.javacore.Ycollection.domain.Smartphone;

public class EqualsTestSmartPhone {

    public static void main(String[] args) {

        // equals not override, compare reference
        Smartphone s1 = new Smartphone("1BACN2", "Pixel");
        Smartphone s2 = new Smartphone("1BACN2", "Pixel1");
        // Smartphone s2 = s1 will be true
        // s1.equals(new Exception()) willbe false so check override equals()
        System.out.println(s1.equals(s2));

    }
}
