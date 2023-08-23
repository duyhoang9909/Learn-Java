package org.example;

public class Mainn {

    public static void modify(Foo x, Foo y) {
        x.num += 1;
        y = new Foo(1);
        y.num++;
    }

    public static void main(String[] args) {
        Foo x = new Foo(1);
        Foo y = new Foo(1);

        modify(x, y);

        System.out.println("X: " + x.num);
        System.out.println("y: " + y.num);
    }
}

class Foo {
    public int num;

    public Foo(int num) {
        this.num = num;
    }
}
