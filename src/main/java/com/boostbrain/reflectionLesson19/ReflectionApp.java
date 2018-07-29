package com.boostbrain.reflectionLesson19;

public class ReflectionApp {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ReflectionChecker reflectionChecker = new ReflectionChecker();
        Rabbit rabbit = new Rabbit();
//        reflectionChecker.showClassName(rabbit);
//        reflectionChecker.showClassFields(rabbit);
//        reflectionChecker.showClassMethods(reflectionChecker);
//        reflectionChecker.showFieldsAnnotations(rabbit);
//        reflectionChecker.showMethodsAnnotations(reflectionChecker);

//        reflectionChecker.fillPrivateFields(rabbit);
//        System.out.println(rabbit.getName());
//        System.out.println(rabbit.getAge());

        Object clone = reflectionChecker.createNewObject(rabbit);
        reflectionChecker.showClassName(clone);
    }
}
