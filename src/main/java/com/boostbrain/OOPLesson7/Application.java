package com.boostbrain.OOPLesson7;

public class Application {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        Dog sharik = new Dog();

        barsik.setName("Barsik");
        sharik.setName("Sharik");

        System.out.println(barsik.getName());
        System.out.println(sharik.getName());

        barsik.voice();
        sharik.voice();

        //TODO take name of animal from class name
        barsik.printSpeed();
        sharik.writeSpeed();
    }
}
