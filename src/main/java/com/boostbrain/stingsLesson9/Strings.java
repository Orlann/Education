package com.boostbrain.stingsLesson9;

public class Strings {

    public static void main(String[] args) {
        String string = "Hello, World!";
        System.out.println(string);
        System.out.println(string.length());

        String string2 = string.concat("\nAll is cool!");
        System.out.println(string2);
        System.out.println(string2.length());

        String string3 = string2.replace('o','i');
        System.out.println(string3);

        String string4 = string2.substring(14,26);
        System.out.println(string4);

        System.out.println("---------String to array-------------");
        String[] stringArr = string2.split(" ");
        for (int i = 0; i < stringArr.length ; i++) {
            System.out.println(stringArr[i]);
        }
    }
}
