package com.boostbrain.typesLesson8;

public class LinkApp {
    public static void main(String[] args) {
        Link A = new Link();
        A.num = 100;
        System.out.println(String.format("A = %s", A.num));

        Link B = A;
        System.out.println(String.format("B = %s", B.num));

        B.num = 200;
        System.out.println(String.format("new A = %s", A.num));

        func(A);
        System.out.println(String.format("A = %s", B.num));

        A.num = 400;
        System.out.println(String.format("A = %s", A.num));

        func(B);
        System.out.println(String.format("A = %s", A.num));
    }

    public static void func(Link link) {
        link.num = 300;
    }

}
