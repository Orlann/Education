package com.boostbrain.typesLesson8;

public class Links {
    public static void main(String[] args) {
        int first[];
        int second[];

        first = new int[10];
        second = first;

        for (int i = 0; i <10 ; i++) {
            first[i]=i;
        }
        System.out.println("First massive");
        for(int i=0; i<10;i++){
            System.out.println(first[i]);
        }

        System.out.println("Second massive");
        for(int i=0; i<10;i++){
            System.out.println(second[i]);
        }

        first[5]=100;
        System.out.println("First massive");
        for(int i=0; i<10;i++){
            System.out.println(first[i]);
        }

        System.out.println("Second massive");
        for(int i=0; i<10;i++){
            System.out.println(second[i]);
        }
    }
}
