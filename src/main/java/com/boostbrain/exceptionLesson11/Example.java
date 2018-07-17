package com.boostbrain.exceptionLesson11;

public class Example {

    public void method1()throws ExampleException{
        throw new ExampleException("Text");
    }

    public void method2()throws NewException{
        throw new NewException();
    }
}
