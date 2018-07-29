package com.boostbrain.genericsLesson15;

public class Generics {


    public static void main(String[] args) {
        CustomArrayList<String> strings = new CustomArrayList<>();

        for(int i=0; i<5; i++){
            strings.add(String.format("String is added %s-th time",i));
        }

        for(int i = 0; i < strings.getLength(); i++){
            System.out.println(strings.get(i));
        }

        function(42);
        function("Check");
        function(5.2);

        CustomArrayList<Integer> list = new CustomArrayList<>();
    }

    static <T> void function(T parameter){
        System.out.println(parameter.toString());
    }
}
