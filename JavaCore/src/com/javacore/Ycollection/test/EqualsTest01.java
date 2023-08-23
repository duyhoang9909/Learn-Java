package com.javacore.Ycollection.test;

public class EqualsTest01 {
    public static void main(String[] args) {

        // literal, string pool
        String name = "William Soune";
        String name2 = "William Soune";
        System.out.println("name with name2 literal, name == name2 is: " + (name == name2));

        // String object
        String name3 = new String("William Soune");
        System.out.println("name literal with name3 String object, name == name3 is: " + (name == name3));

        // equals
        System.out.println("name equals with name3 is: " + name.equals(name3));
    }
}
