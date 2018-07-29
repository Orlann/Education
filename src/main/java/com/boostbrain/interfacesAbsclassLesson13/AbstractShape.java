package com.boostbrain.interfacesAbsclassLesson13;

public abstract class AbstractShape {
    String color;

    public AbstractShape(String color){
        this.color = color;
    }

    public abstract String printName();
    public abstract double printSize();

    public void printColor(){
        System.out.println(String.format("Color is %s", color));
    }
}
