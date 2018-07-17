package com.boostbrain.exceptionLesson11;

public class ExceptionsApp {
    public static void main(String[] args) {
        Example example = new Example();
        try {
            example.method1();
            example.method2();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
