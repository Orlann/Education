package com.boostbrain.objectsLesson16;

public class ObjectApp {
    public static void main(String[] args) {
        Object object = new Double(16.2);
        System.out.println(object.hashCode());
        System.out.println(object.toString());
        System.out.println(object.getClass());

        Class classObject = Double.class;           // The same meaning as next line
        Class classObject2 = object.getClass();     // The same meaning as previous line
    }
}
