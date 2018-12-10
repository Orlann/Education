package ua.edu.lnu.financial.abstractClassesAndInterfaces;

public abstract class Person {
    String name;
    String work;
    int age;

    void printName(String name){
        System.out.println(name);
    }

    void printAge(int age){
        System.out.println(age);
    }

    void printWork(String work){
        System.out.println(work);
    }
}
